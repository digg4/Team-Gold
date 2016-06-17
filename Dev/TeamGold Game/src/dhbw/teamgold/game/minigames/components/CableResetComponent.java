package dhbw.teamgold.game.minigames.components;

import org.newdawn.slick.Color;
import org.newdawn.slick.geom.Point;

import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class CableResetComponent extends Component {

	private static final float VERTICAL_RESET_SPEED = 10f;
	private static final float HORIZONTAL_RESET_SPEED = 10f;

	@Require
	private CableDataComponent data;

	@Override
	public void onUpdate(UpdateArguments arguments) {
//		Point resetPoint = new Point(data.getStart().getX(), data.getStart().getY() + CableDataComponent.HEIGHT);
//
//		if (data.getDrag().equals(resetPoint)) {
//			data.setResetDrag(false);
//		}
//
//		if (data.isResetDrag()) {
//			if (data.getColor() == Color.red) {
//				double dx = Math.cos(data.getDrag().getX() - resetPoint.getX());
//				double dy = Math.sin(data.getDrag().getY() - resetPoint.getY());
//				float travelX = (float) (dx * HORIZONTAL_RESET_SPEED);
//				float travelY = (float) (dy * VERTICAL_RESET_SPEED);
//				float newX = data.getDrag().getX() + travelX;
//				float newY = data.getDrag().getY() + travelY;
//				
//				data.setDrag(new Point(newX, newY));
//			}
//		}
	}
}
