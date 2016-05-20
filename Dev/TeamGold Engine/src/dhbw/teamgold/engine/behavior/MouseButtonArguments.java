package dhbw.teamgold.engine.behavior;

/**
 * Contains additional information that is useful for handling
 * mouse-button-events.
 * 
 * @author Daniel Spaniol
 */
public interface MouseButtonArguments {

	/**
	 * @return The x-coordinate where the mouse-button-event occurred.
	 */
	float getX();

	/**
	 * @return The y-coordinate where the mouse-button-event occured.
	 */
	float getY();

	/**
	 * @return True when the left button was pressed/released, false otherwise.
	 */
	boolean isCausedByLeftButton();

	/**
	 * @return True when the right button was pressed/released, false otherwise.
	 */
	boolean isCausedByRightButton();

}
