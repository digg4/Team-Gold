package dhbw.teamgold.game.mainmenu.button;

import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.services.GameTimeService;
import dhbw.teamgold.engine.components.AreaComponent;

public class StartGameButtonClickHandler extends Component {
	@Require
	private AreaComponent area;
	private GameTimeService gameTimeService = Services.get(GameTimeService.class);
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
