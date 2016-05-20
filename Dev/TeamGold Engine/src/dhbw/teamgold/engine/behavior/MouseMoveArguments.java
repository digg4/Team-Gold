package dhbw.teamgold.engine.behavior;

/**
 * Contains information about where the mouse was before it moved and where it
 * is now.
 * 
 * @author Daniel Spaniol
 */
public interface MouseMoveArguments {

	/**
	 * @return The current x-coordinate of the mouse.
	 */
	float getX();

	/**
	 * @return The current y-coordinate of the mouse.
	 */
	float getY();

	/**
	 * @return The x-coordinate of the mouse before it moved.
	 */
	float getOldX();

	/**
	 * @return The y-coordinate of the mouse before it moved.
	 */
	float getOldY();

	/**
	 * @return The horizontal distance the mouse traveled. This will be positive
	 *         if the mouse moved to the right and negative if the mouse moved
	 *         to the left.
	 */
	float getTraveledX();

	/**
	 * @return The vertical distance the mouse traveled. This will be positive
	 *         if the mouse moved down and negative if the mouse moved up.
	 */
	float getTraveledY();

}
