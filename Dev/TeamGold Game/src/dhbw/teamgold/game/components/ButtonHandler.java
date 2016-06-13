package dhbw.teamgold.game.components;

import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class ButtonHandler extends Component {
	int scene;
	@Require
	AreaComponent area;

	public ButtonHandler(int scene) {
		this.scene = scene;
	}

	@Override
	public void onMouseButtonPressed(MouseButtonArguments arguments) {
		float x = arguments.getX();
		float y = arguments.getY();
		if (area.contains(x, y)) {
			// getGameObject().getScene().switchScene(miniGameSelectorService.getCurrentMiniGameId());
			getGameObject().getScene().switchScene(scene);
		}
	}
}
