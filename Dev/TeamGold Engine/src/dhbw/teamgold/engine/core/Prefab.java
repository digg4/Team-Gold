package dhbw.teamgold.engine.core;

/**
 * A Prefab defines a specific pre-defined GameObject. It basically is a block
 * of initialization code which you can pass to some functions. <br/>
 * <br/>
 * Lets assume you want to create a player-GameObject. Everywhere in the code
 * where you need to create it you have to to this:
 * 
 * <pre>
 * 	protected void initializeGameObjects() {
 * 		GameObject player = gameObjectService.createGameObject();
 * 
 * 		player.addComponent(new MeshComponent(PATH_TO_MESH));
 * 		player.addComponent(new MeshRendererComponent());
 * 		player.addComponent(new WeaponComponent());
 * 		<i>etc...</i>
 * 
 * 		this.addGameObject(player);
 * 	}
 * </pre>
 * 
 * And you would not only have to this for the player but for every other
 * GameObject too. This pollutes the Scene-class and leads to lots of
 * code.duplication. <br/>
 * <br/>
 * With Prefabs you can move these initialize-blocks to their own files so that
 * you can reuse them:
 * 
 * <pre>
 * 	public class PlayerPrefab implements Prefab {
 * 		public GameObject getGameObject() {
 * 			GameObject player = gameObjectService.createGameObject();
 * 
 * 			player.addComponent(new MeshComponent(PATH_TO_MESH));
 * 			player.addComponent(new MeshRendererComponent());
 * 			player.addComponent(new WeaponComponent());
 * 			<i>etc...</i>
 * 
 * 			return player.
 * 		}
 * 	}
 * </pre>
 * 
 * And in the Scene class you can now simply say:
 * 
 * <pre>
 * protected void initializeGameObjects() {
 * 	this.addGameObject(gameObjectService.createGameObject(PlayerPrefab.class));
 * }
 * </pre>
 * 
 * @author Daniel Spaniol
 */
public interface Prefab {

	/**
	 * Creates and returns the pre-defined GameObject. <br/>
	 * <i>Note that this does not force you in any kind of creation pattern. You
	 * could create a new GameObject every time this method is called or use a
	 * prototype or return the same Object or ... </i>
	 * 
	 * @return The pre-defined GameObject.
	 */
	GameObject getGameObject();

}
