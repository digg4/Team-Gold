package dhbw.teamgold.game.minigames.components;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class WaterTapRenderer extends Component {
	
	private Color color;
	
	@Require
	private WaterTapTransform transform;
	
	@Override
	public void onRender(RenderArguments arguments) {
		Graphics g = arguments.getGraphics();
		
		float middleX = transform.getMiddleX();
		float middleY = transform.getMiddleY();
		float x = transform.getX();
		float y = transform.getY();
		float width = transform.getWidth();
		float height = transform.getHeight();
		float angle = transform.getAngle();
		
		g.setColor(color);
		g.rotate(middleX, middleY, angle);
		g.fillRect(x, y, width, height);
		g.rotate(middleX, middleY, -angle);
	}
	
	public void setColor(Color color) {
		this.color = color;
	}

}
