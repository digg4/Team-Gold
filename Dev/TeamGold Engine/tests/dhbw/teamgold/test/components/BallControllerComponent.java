package dhbw.teamgold.test.components;

import org.newdawn.slick.Color;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.behavior.MouseMoveArguments;
import dhbw.teamgold.engine.core.Component;

public class BallControllerComponent extends Component {

	private BallRendererComponent ballRendererComponent;
	private AreaComponent areaComponent;
	
	@Override
	public void onInitializeComponents(InitializeArguments arguments) {
		ballRendererComponent = getGameObject().getComponent(BallRendererComponent.class);
		areaComponent = getGameObject().getComponent(AreaComponent.class);
	}
	
	@Override
	public void onMouseButtonPressed(MouseButtonArguments arguments) {
		if (areaComponent.getArea().contains(arguments.getX(), arguments.getY())) {
			ballRendererComponent.setColor(Color.black);
		} else {
			ballRendererComponent.randomizeColor();
		}
	}
	
	@Override
	public void onMouseMove(MouseMoveArguments arguments) {
	}
	
}
