package dhbw.teamgold.game.minigames.components;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class GameCountdownRenderer extends Component {

	@Require
	private GameCountdownComponent countdown;
	
	@Require
	private AreaComponent area;
	
	@Override
	public void onRenderGui(RenderArguments arguments) {
		float x = area.getAbsoluteArea().getX();
		float y = area.getAbsoluteArea().getY();
		float width = area.getAbsoluteArea().getWidth();
		float height = area.getAbsoluteArea().getHeight();
		float start = 270;
		float end = start + 360 * countdown.getPercentDone();
		
		Graphics g = arguments.getGraphics();
		g.setColor(Color.white);
		g.fillArc(x, y, width, height, start, end);
	}
	
}
