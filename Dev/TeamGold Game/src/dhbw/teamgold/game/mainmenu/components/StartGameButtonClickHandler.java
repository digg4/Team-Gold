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
	
	@Override
	public void onMouseButtonPressed(MouseButtonArguments arguments) {
		float x = arguments.getX();
		float y = arguments.getY();

		if(area.contains(x, y)){
		//	getGameObject().getScene().switchScene(SceneIds.PAUSE_MENU);
			if(!gameTimeService.isTimeTicking()){
				gameTimeService.startTimeTicking();
			}
		}
	}
}
