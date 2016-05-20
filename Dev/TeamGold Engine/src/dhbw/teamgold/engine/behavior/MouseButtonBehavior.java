package dhbw.teamgold.engine.behavior;

/**
 * Behavior that describes how to react when the state of a mouse.button changes
 * (when it is pressed or released).
 * 
 * @author Daniel Spaniol
 */
public interface MouseButtonBehavior {

	/**
	 * Called whenever a mouse-button is pressed. This is called regardless of
	 * whether or not the mouse is over the GameObject.
	 * 
	 * @param arguments
	 *            Additional information like where was the button pressed and
	 *            which button was pressed.
	 */
	void onMouseButtonPressed(MouseButtonArguments arguments);

	/**
	 * Called whenever a mouse-button is released. This is called regardless of
	 * whether or not the mouse is over the GameObject.
	 * 
	 * @param arguments
	 *            Additional information like where was the button released and
	 *            which button was released.
	 */
	void onMouseButtonRelease(MouseButtonArguments arguments);

}
