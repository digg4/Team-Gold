package dhbw.teamgold.engine.core.services;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.behavior.services.BehaviorArgumentService;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.Prefab;
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

		object.forEachComponent(component -> component.onInitializeComponents(arguments));
		return object;
	}

}
