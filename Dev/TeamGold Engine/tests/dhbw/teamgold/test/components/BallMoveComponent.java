package dhbw.teamgold.test.components;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.behavior.MouseMoveArguments;
import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.core.Component;

public class BallMoveComponent extends Component {

	private AreaComponent areaComponent;

	private float verticalSpeed = 200.5f;
	private float horizontalSpeed = 10f;
	private float friction = 1.00001f;
	private float damping = 1.1f;

	private int width;
	private int height;

	@Override
	public void onInitializeComponents(InitializeArguments arguments) {
		areaComponent = getGameObject().getComponent(AreaComponent.class);
	}

	@Override
	public void onInitializeGameObject(InitializeArguments arguments) {
		width = getGameObject().getScene().getSceneWidth();
		height = getGameObject().getScene().getSceneHeight();
	}

	@Override
	public void onFixedUpdate(UpdateArguments arguments) {
		Rectangle area = areaComponent.getArea();

		if ((area.getX() <= 0 && horizontalSpeed < 0)
				|| (area.getX() + area.getWidth() >= width && horizontalSpeed > 0)) {
			horizontalSpeed *= -1;
			horizontalSpeed /= damping;
		}

		if ((area.getY() <= 0 && verticalSpeed < 0)
				|| (area.getY() + area.getHeight() >= height && verticalSpeed > 0)) {
			verticalSpeed *= -1;
			verticalSpeed /= damping;
		}

		float x = (float) (area.getX() + horizontalSpeed * arguments.getSecondsSinceLastUpdate());
		float y = (float) (area.getY() + verticalSpeed * arguments.getSecondsSinceLastUpdate());

		horizontalSpeed /= friction;
		verticalSpeed /= friction;

		area.setLocation(x, y);
	}

	@Override
	public void onRenderBackground(RenderArguments arguments) {
		Graphics g = arguments.getGraphics();

		g.setColor(Color.darkGray);

		for (int x = 0; x < width; x += 20) {
			g.drawLine(x, 0, x, height);
		}

		for (int y = 0; y < height; y += 20) {
			g.drawLine(0, y, width, y);
		}
	}
	
	@Override
	public void onMouseMove(MouseMoveArguments arguments) {
		horizontalSpeed += arguments.getTraveledX();
		verticalSpeed += arguments.getTraveledY();
	}
	
	@Override
	public void onMouseButtonPressed(MouseButtonArguments arguments) {
		if (arguments.isCausedByLeftButton()) {
			horizontalSpeed /= Math.sqrt(damping);
			verticalSpeed /= Math.sqrt(damping);
		}
	}

}
