package dhbw.teamgold.engine.behavior.services;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Point;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.behavior.MouseMoveArguments;
import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.service.Service;

/**
 * This Service is meant to create the arguments for Behaviors. It will keep
 * track of certain "static" data that needs to be saved in order to properly
 * create the arguments (for example the time since the last UpdateArgument was
 * created).
 * 
 * @author Daniel Spaniol
 */
public interface BehaviorArgumentService extends Service {

	/**
	 * @return New arguments with information for initialization.
	 */
	InitializeArguments createInitializeArguments();

	/**
	 * @param graphics
	 *            The Graphics to draw on.
	 * @return New arguments with information for rendering.
	 */
	RenderArguments createRenderArguments(Graphics graphics);

	/**
	 * @return New arguments with information for updating.
	 */
	UpdateArguments createUpdateArguments();

	/**
	 * @param from
	 *            Old location of the mouse.
	 * @param to
	 *            New location of the mouse.
	 * @return New arguments with information about from where to where the
	 *         mouse moved.
	 */
	MouseMoveArguments createMouseMoveArguments(Point from, Point to);

	/**
	 * @param where
	 *            The location where the mouse-button-event occurred.
	 * @param buttonCode
	 *            The code of the button that was pressed or released.
	 * @return New arguments with information about the mouse-button-event.
	 */
	MouseButtonArguments createMouseButtonArguments(Point where, int buttonCode);

}