package dhbw.teamgold.game.mainmenu.components;

import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.GameTimeService;

public class StartGameButtonClickHandler extends Component {
	private GameTimeService gameTimeService = Services.get(GameTimeService.class);
	
	@Require
	private AreaComponent area;
<<<<<<< HEAD:Dev/TeamGold Game/src/dhbw/teamgold/game/mainmenu/components/StartGameButtonClickHandler.java
	@Require
	private ButtonDisabledComponent buttonDisabler;
	private GameTimeService gameTimeService = Services.get(GameTimeService.class);
	//private MiniGameSelectorService miniGameSelectorService = Services.get(MiniGameSelectorService.class);
=======
	
>>>>>>> fca4a29377c0c46b3fcafcb96a62a9e8cec78da1:Dev/TeamGold Game/src/dhbw/teamgold/game/mainmenu/components/StartGameButtonClickHandler.java
	@Override
	public void onMouseButtonPressed(MouseButtonArguments arguments) {
		float x = arguments.getX();
		float y = arguments.getY();
<<<<<<< HEAD:Dev/TeamGold Game/src/dhbw/teamgold/game/mainmenu/components/StartGameButtonClickHandler.java
		if (area.contains(x, y)) {
			if (!buttonDisabler.disableButton()) {
				if (!gameTimeService.isTimeTicking()) {
					gameTimeService.startTimeTicking();

				}
				//getGameObject().getScene().switchScene(miniGameSelectorService.getNextMiniGameId());
				getGameObject().getScene().switchScene(SceneIds.PAUSE_MENU);
=======

		if(area.contains(x, y)){
		//	getGameObject().getScene().switchScene(SceneIds.PAUSE_MENU);
			if(!gameTimeService.isTimeTicking()){
				gameTimeService.startTimeTicking();
>>>>>>> fca4a29377c0c46b3fcafcb96a62a9e8cec78da1:Dev/TeamGold Game/src/dhbw/teamgold/game/mainmenu/components/StartGameButtonClickHandler.java
			}
		}
	}
}
