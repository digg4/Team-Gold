package dhbw.teamgold.game.minigames.components;

import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.MiniGameSelectorService;
import dhbw.teamgold.game.minigames.components.TrafficLightTimer.Phase;

public class TrafficLightClickHandler extends Component {

	private MiniGameSelectorService selectorService = Services.get(MiniGameSelectorService.class);
	
	@Require
	private TrafficLightTimer timer;
	
	@Override
	public void onMouseButtonPressed(MouseButtonArguments arguments) {
		if (timer.getPhase() == Phase.RED) {
			getGameObject().getScene().switchScene(selectorService.getCurrentLoseSceneId());
		} 
		
		if (timer.getPhase() == Phase.GREEN){
			getGameObject().getScene().switchScene(selectorService.getCurrentWinSceneId());
		}
	}
}
