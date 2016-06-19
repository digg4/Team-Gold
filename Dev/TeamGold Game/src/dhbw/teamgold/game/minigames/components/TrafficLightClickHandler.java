package dhbw.teamgold.game.minigames.components;

import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.services.WinLoseService;
import dhbw.teamgold.game.minigames.components.TrafficLightTimer.Phase;

public class TrafficLightClickHandler extends Component {

	private WinLoseService winLoseService = Services.get(WinLoseService.class);
	
	@Require
	private TrafficLightTimer timer;
	
	@Override
	public void onMouseButtonPressed(MouseButtonArguments arguments) {
		if (timer.getPhase() == Phase.RED) {
			winLoseService.lose();
		} 
		
		if (timer.getPhase() == Phase.GREEN){
			winLoseService.win();
		}
		
		getGameObject().getScene().switchScene(SceneIds.STATS_SCREEN);
	}
}
