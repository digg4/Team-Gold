package dhbw.teamgold.game.optionsmenu.components;

import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;
import dhbw.teamgold.game.SceneIds;

public class ResumeeButtonHandler extends Component {
	@Require
	AreaComponent area;
	//Vorherige Scene muss in einem Service gespeichert werden.

	@Override
	public void onMouseButtonPressed(MouseButtonArguments arguments) {
		float x = arguments.getX();
		float y = arguments.getY();
		if (area.contains(x, y)) {
			getGameObject().getScene().switchScene(SceneIds.MAIN_MENU);
		}
	}
}
