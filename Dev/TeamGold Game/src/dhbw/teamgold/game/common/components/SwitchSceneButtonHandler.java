package dhbw.teamgold.game.common.components;

import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class SwitchSceneButtonHandler extends Component {
	
	private final int scene;
	
	@Require
	private AreaComponent area;

	public SwitchSceneButtonHandler(int scene) {
		this.scene = scene;
	}

	@Override
	public void onMouseButtonPressed(MouseButtonArguments arguments) {
		float x = arguments.getX();
		float y = arguments.getY();

		if (area.contains(x, y)) {
			getGameObject().getScene().switchScene(scene);
		}
	}
}
