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
		if (data.dragContains(arguments.getX(), arguments.getY())) {
			dragging = true;
			data.setResetDrag(false);
		}
	}

	@Override
	public void onMouseButtonRelease(MouseButtonArguments arguments) {
		if (data.dragContains(arguments.getX(), arguments.getY())) {
			System.out.println("CableController.onMouseButtonRelease()");
			dragging = false;
			data.setResetDrag(true);
		}}

	@Override
	public void onMouseMove(MouseMoveArguments arguments) {
		if (dragging) {
			data.setDrag(new Point(arguments.getX(), arguments.getY()));
		}
	}

}
