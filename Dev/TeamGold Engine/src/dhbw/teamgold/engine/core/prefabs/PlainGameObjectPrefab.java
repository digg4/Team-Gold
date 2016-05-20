package dhbw.teamgold.engine.core.prefabs;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.GameObjectImpl;
import dhbw.teamgold.engine.core.Prefab;

/**
 * Creates a new plain GameObject without any Components.
 * 
 * @author Daniel Spaniol
 */
public class PlainGameObjectPrefab implements Prefab {

	@Override
	public GameObject getGameObject() {
		return new GameObjectImpl();
	}

}
