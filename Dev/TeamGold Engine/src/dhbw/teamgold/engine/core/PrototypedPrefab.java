package dhbw.teamgold.engine.core;

import dhbw.teamgold.engine.core.prefabs.PlainGameObjectPrefab;
import dhbw.teamgold.engine.core.services.GameObjectService;
import dhbw.teamgold.engine.service.Services;

/**
 * A PrototypedPrefab should make the use of Prefabs a bit easier. Since you
 * will always need to create GameObjects you will always need the
 * GameObjectService. Also pretty often you want to have an already existing
 * GameObject and just add some more Components or set some settings.
 * 
 * @author Daniel Spaniol
 */
public abstract class PrototypedPrefab implements Prefab {

	/**
	 * The Service every PrototypedPrefab uses to create the GameObject.
	 */
	private static GameObjectService gameObjectService;

	/**
	 * The Prefab that defines the prototype.
	 */
	private Prefab prototype;

	/**
	 * Inject all needed Services in a static way.
	 */
	private static void staticInjectServices() {
		if (gameObjectService == null) {
			gameObjectService = Services.get(GameObjectService.class);
		}
	}

	/**
	 * Creates a new PrototypedPrefab that has the plain GameObject without any
	 * Components as prototype.
	 */
	public PrototypedPrefab() {
		this(new PlainGameObjectPrefab());
	}

	/**
	 * Creates a new PrototypedPrefab where the given Prefab defines the
	 * prototype.
	 * 
	 * @param prototype
	 *            The Prefab defining the prototype.
	 */
	public PrototypedPrefab(Prefab prototype) {
		this.prototype = prototype;
		staticInjectServices();
	}

	@Override
	public GameObject getGameObject() {
		GameObject object = gameObjectService.createGameObject(prototype);
		initializeGameObject(object);
		return object;
	}

	/**
	 * This method is used in order to fill the GameObject with Components.
	 * <br/>
	 * Thr GameObject provided here is the one specified by the Prefab taht
	 * defines the prototype (hence it IS the a clone of the prototype).
	 * 
	 * @param object
	 */
	protected abstract void initializeGameObject(GameObject object);

}
