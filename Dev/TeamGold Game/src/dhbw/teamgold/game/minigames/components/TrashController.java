package dhbw.teamgold.game.minigames.components;

import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.behavior.MouseMoveArguments;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class TrashController extends Component {

	@Require
	private AreaComponent areaComponent;

	@Require
	private PhysicsComponent physicsComponent;

	private boolean dragging = false;
	private float dx;
	private float dy;

	@Override
	public void onMouseButtonPressed(MouseButtonArguments arguments) {
		if (areaComponent.contains(arguments.getX(), arguments.getY())) {
			dragging = true;
			physicsComponent.setApplyPhysics(false);
		}
	}

	@Override
	public void onMouseButtonRelease(MouseButtonArguments arguments) {
		if (dragging) {
			dragging = false;
			physicsComponent.setApplyPhysics(true);
			physicsComponent.setHorizontalForce(dx * 200);
			physicsComponent.setVerticalForce(dy * 200);
			physicsComponent.setHorizontalSpeed(dx);
			physicsComponent.setVerticalSpeed(dy);
		}
	}

	@Override
	public void onMouseMove(MouseMoveArguments arguments) {
		if (dragging) {
			areaComponent.getAbsoluteArea().setCenterX(arguments.getX());
			areaComponent.getAbsoluteArea().setCenterY(arguments.getY());
			dx = arguments.getTraveledX();
			dy = arguments.getTraveledY();
		}
	}

}
