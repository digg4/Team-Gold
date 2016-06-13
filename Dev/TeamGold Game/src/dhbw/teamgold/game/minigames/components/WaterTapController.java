package dhbw.teamgold.game.minigames.components;

import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Transform;

import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;
import dhbw.teamgold.game.SceneIds;

public class WaterTapController extends Component {
	
	@Require
	private WaterTapTransform transform;
	
	private int clicksToDo = 10;
	
	@Override
	public void onMouseButtonPressed(MouseButtonArguments arguments) {
		float x = transform.getX();
		float y = transform.getY();
		float width = transform.getWidth();
		float height = transform.getHeight();
		float angle = transform.getAngle();
		float mouseX = arguments.getX();
		float mouseY = arguments.getY();
		
		Rectangle rectangle = new Rectangle(x, y, width, height);
		
		rectangle.transform(Transform.createRotateTransform((float) (angle / 180 * Math.PI * 2)));
				
		if (rectangle.contains(mouseX, mouseY)) {
			angle += 5;
			transform.setAngle(angle);
			clicksToDo--;
			
			if (clicksToDo <= 0) {
				getGameObject().getScene().switchScene(SceneIds.MAIN_MENU);
			}
		}
	}	
}
