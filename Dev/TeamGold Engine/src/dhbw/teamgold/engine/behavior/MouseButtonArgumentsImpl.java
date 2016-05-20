package dhbw.teamgold.engine.behavior;

import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Point;

/**
 * Implementation of MouseButtonArguments.
 * 
 * @author Daniel Spaniol
 */
public class MouseButtonArgumentsImpl implements MouseButtonArguments {

	private Point location;
	private int buttonCode;

	/**
	 * @param location
	 *            The location where the mouse-button-event occured.
	 */
	public void setLocation(Point location) {
		this.location = location;
	}

	/**
	 * @param buttonCode
	 *            The code of the button that caused the event. You can look the
	 *            codes up in {@link org.newdawn.slick.Input}.
	 */
	public void setButtonCode(int buttonCode) {
		this.buttonCode = buttonCode;
	}

	@Override
	public float getX() {
		return location.getX();
	}

	@Override
	public float getY() {
		return location.getY();
	}

	@Override
	public boolean isCausedByLeftButton() {
		return buttonCode == Input.MOUSE_LEFT_BUTTON;
	}

	@Override
	public boolean isCausedByRightButton() {
		return buttonCode == Input.MOUSE_RIGHT_BUTTON;
	}

}
