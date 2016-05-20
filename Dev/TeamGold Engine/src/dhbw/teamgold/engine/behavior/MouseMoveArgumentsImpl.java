package dhbw.teamgold.engine.behavior;

import org.newdawn.slick.geom.Point;

/**
 * Implementation of MouseMoveArguments.
 * 
 * @author Daniel Spaniol
 */
public class MouseMoveArgumentsImpl implements MouseMoveArguments {

	private Point oldLocation;
	private Point newLocation;

	/**
	 * @param oldLocation
	 *            The location the mouse was before it moved.
	 */
	public void setOldLocation(Point oldLocation) {
		this.oldLocation = oldLocation;
	}

	/**
	 * @param newLocation
	 *            The location the mouse was after it moved.
	 */
	public void setNewLocation(Point newLocation) {
		this.newLocation = newLocation;
	}

	@Override
	public float getX() {
		return newLocation.getX();
	}

	@Override
	public float getY() {
		return newLocation.getY();
	}

	@Override
	public float getOldX() {
		return oldLocation.getX();
	}

	@Override
	public float getOldY() {
		return oldLocation.getY();
	}

	@Override
	public float getTraveledX() {
		return getX() - getOldX();
	}

	@Override
	public float getTraveledY() {
		return getY() - getOldY();
	}

}
