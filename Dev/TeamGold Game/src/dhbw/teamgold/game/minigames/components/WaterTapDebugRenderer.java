package dhbw.teamgold.game.minigames.components;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class WaterTapDebugRenderer extends Component {

	private Color color;
	
	@Require
	private WaterTapTransfromComponent transform;

	public WaterTapDebugRenderer(Color color) {
		this.color = color;
	}
	
	@Override
	public void onRender(RenderArguments arguments) {
		Graphics g = arguments.getGraphics();
		g.setColor(color);
		g.fill(transform.getBounds());
	}
	
}
