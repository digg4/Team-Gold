package dhbw.teamgold.game.minigames.components;

import org.newdawn.slick.geom.Point;

import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.behavior.MouseMoveArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class CableController extends Component {

	@Require
	private CableDataComponent data;

	private boolean dragging = false;

	@Override
	public void onMouseButtonPressed(MouseButtonArguments arguments) {
		if (data.dragContains(arguments.getX(), arguments.getY()) && !data.isFinished()) {
			dragging = true;
		}
	}

	@Override
	public void onMouseButtonRelease(MouseButtonArguments arguments) {
		if (data.dragContains(arguments.getX(), arguments.getY())) {
			if (data.getEnd().contains(data.getDrag())) {
				data.setFinished(true);
			} else {
				data.resetDrag();
			}
			dragging = false;
		}
	}

	@Override
	public void onMouseMove(MouseMoveArguments arguments) {
		if (dragging) {
			data.setDrag(new Point(arguments.getX(), arguments.getY()));
		}
	}

}
