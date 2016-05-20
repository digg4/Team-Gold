package dhbw.teamgold.engine.behavior;

/**
 * This Behavior describes every kind of initialize a component can go through.
 * 
 * @author Daniel Spaniol
 */
public interface InitializeBehavior {

	/**
	 * This initialize-method is called when the GameObject was created and all
	 * Components are added. This means inside this code you may request other
	 * Components from the GameObject.
	 * 
	 * @param arguments
	 *            Additional initialization information.
	 */
	void onInitializeComponents(InitializeArguments arguments);

	/**
	 * This initialize-method is called when all the Components are already
	 * initialized and the GameObject is added to the Scene. This means inside
	 * this code you may request the GameObjects Scene.
	 * 
	 * @param arguments
	 *            Additional initialization information.
	 */
	void onInitializeGameObject(InitializeArguments arguments);

}
