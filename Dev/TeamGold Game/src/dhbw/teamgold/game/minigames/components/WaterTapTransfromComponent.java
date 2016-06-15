package dhbw.teamgold.game.minigames.components;

import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.Transform;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.core.Component;

public class WaterTapTransfromComponent extends Component {

	private static final float RADIUS = 100f;

	private float relativeMiddleX;
	private float relativeMiddleY;

	private Shape bounds;

	public WaterTapTransfromComponent(float relativeMiddleX, float relativeMiddleY) {
		this.relativeMiddleX = relativeMiddleX;
		this.relativeMiddleY = relativeMiddleY;
	}

	public Shape getBounds() {
		return bounds;
	}

	public void rotate(float angleInRadians) {
		float centerX = bounds.getCenterX();
		float centerY = bounds.getCenterY();
		bounds = bounds.transform(Transform.createRotateTransform(angleInRadians, centerX, centerY));
	}

	@Override
	public void onInitializeGameObject(InitializeArguments arguments) {
		int width = getGameObject().getScene().getSceneWidth();
		int height = getGameObject().getScene().getSceneHeight();

		// bounds = new Circle(relativeMiddleX * width, relativeMiddleY *
		// height, RADIUS);
		bounds = new Rectangle(relativeMiddleX * width - RADIUS / 2, relativeMiddleY * height - RADIUS / 2, RADIUS / 2,
				RADIUS / 2);
	}
}
