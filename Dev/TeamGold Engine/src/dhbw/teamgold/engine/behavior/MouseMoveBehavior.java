package dhbw.teamgold.engine.behavior;

/**
 * Behavior that describes how to react on mouse-move-events
 * 
 * @author Daniel Spaniol.
 *
 */
public interface MouseMoveBehavior {

	/**
	 * Called when the mouse moves.
	 * 
	 * @param arguments
	 *            Information about from where to where the mouse moves.
	 */
	void onMouseMove(MouseMoveArguments arguments);

}
