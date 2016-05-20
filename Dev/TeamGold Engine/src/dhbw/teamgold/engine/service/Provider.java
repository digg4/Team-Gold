package dhbw.teamgold.engine.service;

/**
 * Creates a new instance of the given ServiceType. Always remember to register
 * your Provider in the Services class because otherwise you will not be able to
 * create that Service.
 * 
 * @author Daniel
 *
 * @param <ServiceType>
 *            The type of Service to create.
 */
public interface Provider<ServiceType extends Service> {

	/**
	 * @return A new instance of the given ServiceType.
	 */
	ServiceType createService();

	/**
	 * We need a nethod to keep track of the ServiceType since Java-Generics do not exist to Runtime.
	 * 
	 * @return The type of Service this provider creates.
	 */
	Class<ServiceType> getType();

}
