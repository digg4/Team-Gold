package dhbw.teamgold.game.common.components;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class ImageRendererComponent extends Component {

	@Require
	private ImageComponent imageComponent;
	
	@Require
	private AreaComponent areaComponent;
	
	@Override
	public void onRender(RenderArguments arguments) {
		Image image = imageComponent.getImage();
		
		if (image != null) {
			drawImage(image, areaComponent.getArea());
		} else {
			drawBlueRectangle(arguments.getGraphics(), areaComponent.getArea());
		}
	}
	
	private void drawImage(Image image, Rectangle area) {
		float x = area.getX();
		float y = area.getY();
		float width = area.getWidth();
		float height = area.getHeight();
		
		image.draw(x, y, width, height);
	}
	
	private void drawBlueRectangle(Graphics g, Rectangle rectangle) {
		g.setColor(Color.blue);
		g.fillRect(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
	}
	
}
