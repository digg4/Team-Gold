package dhbw.teamgold.engine.core;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.behavior.InitializeBehavior;
import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.behavior.MouseButtonBehavior;
import dhbw.teamgold.engine.behavior.MouseMoveArguments;
import dhbw.teamgold.engine.behavior.MouseMoveBehavior;
import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.behavior.RenderBehavior;
import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.behavior.UpdateBehavior;

/**
 * Components define data and behavior for GameObjects. <br/>
 * There are some things you should note:
 * <ul>
 * <li>Every GameObject might only have at most one Component of the same type
 * </li>
 * <li>Every Component should only have <b>one</b> responsibility</li>
 * <li>You can access other Components from the same GameObject</li>
 * <li>You can override <i>on...</i>-methods to define behavior</li>
 * </ul>
 * 
 * <i>Note that all the behavior-interfaces are implemented by dummy-methods so
 * that you can easily override the methods you need and don't have to override
 * any more methods. This also means you dont have to call super.on...() in any
 * of those since the super call won't do anything at all.</i>
 * 
 * @author Daniel Spaniol
 */
public abstract class Component
		implements RenderBehavior, UpdateBehavior, InitializeBehavior, MouseMoveBehavior, MouseButtonBehavior {

	/**
	 * The GameObject which contains <code>this</code>
	 */
	private GameObject gameObject;

	/**
	 * Sets the GameObject which contains <code>this</code>. <br/>
	 * <i>Note that this is package-private since only GameObject should call
	 * this method once</i>.
	 * 
	 * @param gameObject
	 *            The GameObject which contains <code>this</code>.
	 */
	void setGameObject(GameObject gameObject) {
		this.gameObject = gameObject;
	}

	/**
	 * Returns the GameObject which contains <code>this</code>. <br/>
	 * This is useful in order to access other Components of that GameObject or
	 * access the Scene which contains the GameObject.
	 * 
	 * @return The GameObject which contains <code>this</code>.
	 */
	protected final GameObject getGameObject() {
		return gameObject;
	}

	@Override
	public void onUpdate(UpdateArguments arguments) {
	}

	@Override
	public void onRender(RenderArguments arguments) {
	}

	@Override
	public void onRenderBackground(RenderArguments arguments) {
	}

	@Override
	public void onRenderGui(RenderArguments arguments) {
	}

	@Override
	public void onInitializeComponents(InitializeArguments arguments) {
	}

	@Override
	public void onInitializeGameObject(InitializeArguments arguments) {
	}

	@Override
	public void onMouseMove(MouseMoveArguments arguments) {
	}
	
	@Override
	public void onMouseButtonPressed(MouseButtonArguments arguments) {
	}
	
	@Override
	public void onMouseButtonRelease(MouseButtonArguments arguments) {
	}

}
