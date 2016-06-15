package dhbw.teamgold.game.optionsmenu.components;

import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;
import dhbw.teamgold.engine.core.services.SceneHistoryService;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.SceneIds;

public class ResumeeButtonHandler extends Component {
	@Require
	AreaComponent area;
	private SceneHistoryService sceneHistoryService = Services.get(SceneHistoryService.class);

	@Override
	public void onMouseButtonPressed(MouseButtonArguments arguments) {
		float x = arguments.getX();
		float y = arguments.getY();
		if (area.contains(x, y)) {
			System.out.println(sceneHistoryService.popLastSceneId());
			getGameObject().getScene().switchScene(sceneHistoryService.popLastSceneId());
		}
	}
}
