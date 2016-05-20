package dhbw.teamgold.engine.behavior;

import org.newdawn.slick.Graphics;

/**
 * Implementation of RenderArguments. Basically saves the Graphics to draw on.
 * 
 * @author Daniel Spaniol
 */
public class RenderArgumentsImpl implements RenderArguments {

	private Graphics graphics;

	public void setGraphics(Graphics graphics) {
		this.graphics = graphics;
	}

	@Override
	public Graphics getGraphics() {
		return graphics;
	}

}
