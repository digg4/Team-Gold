package dhbw.teamgold.engine.service;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import dhbw.teamgold.engine.behavior.services.BehaviorArgumentServiceProvider;
import dhbw.teamgold.engine.core.services.AssetsServiceProvider;
import dhbw.teamgold.engine.core.services.GameObjectServiceProvider;
import dhbw.teamgold.engine.core.services.SceneHistoryServiceProvider;
import dhbw.teamgold.engine.service.exception.DuplicatedProviderException;
import dhbw.teamgold.engine.service.exception.NoSuchProviderException;

/**
 * A global access-point to all the services. <br/>
 * Here you can register Providers which create services and get the Services
 * for which providers are registered.
 * 
 * @author Daniel Spaniol
 */
public final class Services {

	/**
	 * A mapping from ServiceTypes the Providers that create them.
	 */
	private static Map<Class<?>, Provider<?>> providerMapping = new HashMap<>();
	/**
	 * This contains all the services that have been created so far.
	 */
	private static Map<Class<?>, Service> serviceCache = new HashMap<>();

	/**
	 * Registers a provider to create the service when it is requested for the
	 * first time.
	 * 
	 * @param provider
	 *            The Provider which creates the service.
	 * @throws DuplicatedProviderException
	 *             Thrown when you try to registered a second Provider for the
	 *             same ServiceType.
	 */
	public static void provide(Provider<?> provider) throws DuplicatedProviderException {
		if (providerMapping.containsKey(provider.getType())) {
			throw new DuplicatedProviderException(provider.getType());
		}

		providerMapping.put(provider.getType(), provider);
	}

	/**
	 * Returns the instance of the given ServiceType. When a Service is
	 * requested for the first time this will create that Service.
	 * 
	 * @param type
	 *            The type of Service to return.
	 * @return The instance of that ServiceType.
	 * @throws NoSuchProviderException
	 *             Thrown when no provider is found to create that Service.
	 */
	@SuppressWarnings("unchecked")
	public static <ServiceType extends Service> ServiceType get(Class<ServiceType> type)
			throws NoSuchProviderException {
		if (serviceCache.containsKey(type)) {
			return (ServiceType) serviceCache.get(type);
		}

		if (!providerMapping.containsKey(type)) {
			throw new NoSuchProviderException(type);
		}
		
		ServiceType service = (ServiceType) providerMapping.get(type).createService();
		serviceCache.put(type, service);
		Services.injectInto(service);

		return service;
	}

	/**
	 * Sets all the Services that are annotated with <code>&#64;Inject</code> to
	 * the instance of that service. This should only be used if you have few
	 * instances of your object because otherwise it might lead to performance
	 * problems. If you have multiple instances of your target you should
	 * consider saving Services in static fields. <br/>
	 * This methods is automatically called for Services.
	 * 
	 * @param target
	 *            The Object with Services to be set.
	 */
	@SuppressWarnings("unchecked")
	public static void injectInto(Object target) {
		for (Field field : target.getClass().getDeclaredFields()) {
			if (isFieldAnnotadedService(field)) {
				Class<? extends Service> fieldType = (Class<? extends Service>) field.getType();
				field.setAccessible(true);

				try {
					field.set(target, Services.get(fieldType));
				} catch (IllegalArgumentException | IllegalAccessException | NoSuchProviderException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * A helper to determine if the given Field is a Service with the
	 * <code>&#64;Inject</code>-annotation.
	 * 
	 * @param field
	 *            The field to test.
	 * @return <code>true</code> when the field is a sub-class of Service and it
	 *         has the <code>&#64;Inject</code>-annotation, <code>false</code>
	 *         otherwise.
	 */
	private static boolean isFieldAnnotadedService(Field field) {
		return Service.class.isAssignableFrom(field.getType()) && field.isAnnotationPresent(Inject.class);
	}

	/**
	 * Registers the default providers that are defined in the engine itself.
	 * This methods should be called once at the beginning of the game.
	 */
	public static void registerDefaultProviders() {
		Services.provide(new GameObjectServiceProvider());
		Services.provide(new BehaviorArgumentServiceProvider());
		Services.provide(new AssetsServiceProvider());
		Services.provide(new SceneHistoryServiceProvider());
	}

	/**
	 * Private since this is a static class.
	 */
	private Services() {
	}

}
