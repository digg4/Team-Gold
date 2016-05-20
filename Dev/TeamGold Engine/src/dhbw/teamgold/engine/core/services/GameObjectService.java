package dhbw.teamgold.engine.core.services;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.Prefab;
import dhbw.teamgold.engine.service.Service;

/**
 * This Service will let you create GameObjects. Note that you should always use
 * this Service and never try to instantiate GameObject by your own.
 * 
 * @author Daniel Spaniol
 */
public interface GameObjectService extends Service {

	/**
	 * @return A new plain GameObject.
	 */
	GameObject createGameObject();

	/**
	 * Creates a new GameObject with the given Prefab.
	 * 
	 * @param prefab
	 *            Prefab which specifies the GameObject
	 * @return The pre-defined GameObject.
	 */
	GameObject createGameObject(Prefab prefab);

}
