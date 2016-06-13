package dhbw.teamgold.game.mainmenu.components;

import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.GameTimeService;

public class ButtonDisabledComponent extends Component{
	GameTimeService gameTimeService = Services.get(GameTimeService.class);
	public boolean disableButton(){
		if(gameTimeService.isTimeOver()){
			return true;
		}
		return false;
	}
}
