package dhbw.teamgold.game.mainmenu.components;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class PlaneAnimator extends Component {

	@Require
	private AreaComponent areaComponent;

	private float sceneWidth;
	private float xPixelPerSecond;

	@Override
	public void onInitializeGameObject(InitializeArguments arguments) {
		sceneWidth = getGameObject().getScene().getSceneWidth();
		xPixelPerSecond = sceneWidth / 6;
	}

	@Override
	public void onUpdate(UpdateArguments arguments) {
		double secondsSinceLastUpdate = arguments.getSecondsSinceLastUpdate();
		float x = areaComponent.getAbsoluteArea().getX();
		float y = areaComponent.getAbsoluteArea().getY();

		x += xPixelPerSecond * secondsSinceLastUpdate;
		y += Math.cos(System.currentTimeMillis() % 2000 / 2000.0 * Math.PI * 2) / 3;

		if (x > sceneWidth) {
			x = - 2 * sceneWidth;
		}
		
		areaComponent.getAbsoluteArea().setX(x);
		areaComponent.getAbsoluteArea().setY(y);
	}

}
