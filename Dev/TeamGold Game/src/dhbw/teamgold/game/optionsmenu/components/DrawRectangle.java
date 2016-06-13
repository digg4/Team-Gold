package dhbw.teamgold.game.optionsmenu.components;

import org.newdawn.slick.Color;
import org.newdawn.slick.Font;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class DrawRectangle extends Component {
	private Color textColor;
	@Require
	AreaComponent area;
	@Override
	public void onRenderGui(RenderArguments arguments) {
		Graphics g = arguments.getGraphics();
		
		float x = area.getAbsoluteArea().getX();
		float y = area.getAbsoluteArea().getY();
		float width = area.getAbsoluteArea().getWidth();
		float height = area.getAbsoluteArea().getHeight();
		g.setColor(Color.gray);
		g.drawRect(x, y, width, height);
		g.setColor(Color.lightGray.brighter());
		g.fillRect(x, y, width, height);
	}
}
