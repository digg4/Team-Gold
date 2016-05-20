package dhbw.teamgold.test.components;

import java.util.Random;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.core.Component;

public class BallRendererComponent extends Component {

	private static final Color[] COLORS = {
			Color.red, Color.magenta, Color.blue, Color.cyan, Color.gray, Color.green, Color.orange, Color.pink
	};
	private static Random random = new Random();
	
	private AreaComponent areaComponent;
	private Color color;
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void randomizeColor() {
		Color newColor;
		
		do {
			newColor = COLORS[random.nextInt(COLORS.length)];
		} while (color == newColor);
		
		color = newColor;
	}
	
	@Override
	public void onInitializeComponents(InitializeArguments arguments) {
		areaComponent = getGameObject().getComponent(AreaComponent.class);
		
		randomizeColor();
	}
	
	@Override
	public void onRender(RenderArguments arguments) {
		Graphics g = arguments.getGraphics();
		Rectangle area = areaComponent.getArea();
		
		g.setColor(color);
		g.fillOval(area.getX(), area.getY(), area.getWidth(), area.getHeight());
	}
	
}
