package dhbw.teamgold.game.mainmenu.components;

import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.services.GameTimeService;

public class StartGameButtonClickHandler extends Component {
	private GameTimeService gameTimeService = Services.get(GameTimeService.class);

	@Require
	private AreaComponent area;
	@Require
	private ButtonDisabledComponent buttonDisabler;

	// private MiniGameSelectorService miniGameSelectorService =
	// Services.get(MiniGameSelectorService.class);
	@Override
	public void onMouseButtonPressed(MouseButtonArguments arguments) {
		float x = arguments.getX();
		float y = arguments.getY();
		if (area.contains(x, y)) {
			if (!buttonDisabler.disableButton()) {
				if (!gameTimeService.isTimeTicking()) {
					gameTimeService.startTimeTicking();

				}
				//getGameObject().getScene().switchScene(miniGameSelectorService.getNextMiniGameId());
				getGameObject().getScene().switchScene(SceneIds.PAUSE_MENU);

			}
		}
	}
}