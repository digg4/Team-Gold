package dhbw.teamgold.engine.behavior;

import org.newdawn.slick.Graphics;

/**
 * These arguments contain additional information that is needed for rendering.
 * 
 * @author Daniel Spaniol
 */
public interface RenderArguments {

	/**
	 * @return The Graphics-object to draw on.
	 */
	Graphics getGraphics();

}
