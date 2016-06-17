package dhbw.teamgold.game.minigames.components;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class TrashBoundsColider extends Component {

	@Require
	private PhysicsComponent physicsComponent;

	@Require
	private AreaComponent areaComponent;

	private int sceneWidth;

	@Override
	public void onInitializeGameObject(InitializeArguments arguments) {
		sceneWidth = getGameObject().getScene().getSceneWidth();
	}

	@Override
	public void onUpdate(UpdateArguments arguments) {
		Rectangle area = areaComponent.getAbsoluteArea();

		float verticalSpeed = physicsComponent.getVerticalSpeed();
		float horizontalSpeed = physicsComponent.getHorizontalSpeed();
		float verticalForce = physicsComponent.getVerticalForce();
		float horizontalForce = physicsComponent.getHorizontalForce();

		if (area.getMinX() <= 0) {
			area.setX(1);
			physicsComponent.setHorizontalSpeed(-0.4f * horizontalSpeed);
			physicsComponent.setHorizontalForce(-0.1f * horizontalForce);
		}
		
		if (area.getMaxX() >= sceneWidth) {
			area.setX(sceneWidth - area.getWidth() - 1);
			physicsComponent.setHorizontalSpeed(-0.4f * horizontalSpeed);
			physicsComponent.setHorizontalForce(-0.1f * horizontalForce);
		}
		
		if (area.getMinY() <= 0) {
			area.setY(1);
			physicsComponent.setVerticalSpeed(-0.4f * verticalSpeed);
			physicsComponent.setVerticalForce(-0.1f * verticalForce);
		}
	}

}
