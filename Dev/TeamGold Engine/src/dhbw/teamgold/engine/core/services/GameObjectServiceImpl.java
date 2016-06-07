package dhbw.teamgold.engine.core.services;

import java.lang.reflect.Field;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.behavior.services.BehaviorArgumentService;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.Prefab;
import dhbw.teamgold.engine.core.Require;
import dhbw.teamgold.engine.core.exception.NoSuchComponentException;
import dhbw.teamgold.engine.core.prefabs.PlainGameObjectPrefab;
import dhbw.teamgold.engine.service.Inject;

/**
 * Implementation of GameObjectService. Do not create this by yourself, use the
 * Services class to get it.
 * 
 * @author Daniel Spaniol
 */
public class GameObjectServiceImpl implements GameObjectService {

	@Inject
	BehaviorArgumentService behaviorArgumentService;

	/**
	 * A Prefab to create a plain GameObject. It is saved here since there is no
	 * need to create a new instance of it every time we want a GameObject.
	 */
	private PlainGameObjectPrefab plainGameObjectPrefab = new PlainGameObjectPrefab();

	@Override
	public GameObject createGameObject() {
		return createGameObject(plainGameObjectPrefab);
	}

	@Override
	public GameObject createGameObject(Prefab prefab) {
		GameObject object = prefab.getGameObject();
		InitializeArguments arguments = behaviorArgumentService.createInitializeArguments();

		object.forEachComponent(component -> {
			provideRequiredComponents(component, object);
			component.onInitializeComponents(arguments);
		});

		return object;
	}

	/**
	 * The provided Component is scanned for all fields that are Components and
	 * have the Require-annotation. These are set to the instance of that
	 * Component-type the provided GameObject has.
	 * 
	 * @param component
	 *            The Component that requires Components.
	 * @param object
	 *            The GameObject that has the instances of the requested
	 *            Component.
	 * @throws NoSuchComponentException
	 *             Thrown when the GameObject does not have the instance of a
	 *             required Component.
	 */
	@SuppressWarnings("unchecked")
	private void provideRequiredComponents(Component component, GameObject object) throws NoSuchComponentException {
		for (Field field : component.getClass().getDeclaredFields()) {
			if (fieldIsRequiredComponent(field)) {
				Class<? extends Component> type = (Class<? extends Component>) field.getType();
				Component requiredComponent = object.getComponent(type);

				field.setAccessible(true);
				try {
					field.set(component, requiredComponent);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}

	/**
	 * Checks if a field is a Component and has the Require-annotation.
	 * 
	 * @param field
	 *            The field to check.
	 * @return True if the field is a Component with the Require-annotation,
	 *         false otherwise.
	 */
	private boolean fieldIsRequiredComponent(Field field) {
		boolean isComponent = Component.class.isAssignableFrom(field.getType());
		boolean isRequired = field.isAnnotationPresent(Require.class);
		
		return isRequired && isComponent;
	}

}
