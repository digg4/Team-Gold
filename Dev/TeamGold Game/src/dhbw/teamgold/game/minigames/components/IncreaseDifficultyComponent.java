package dhbw.teamgold.game.minigames.components;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.GameStatsService;

public class IncreaseDifficultyComponent extends Component {

	private GameStatsService statsService = Services.get(GameStatsService.class);
	
	@Override
	public void onInitializeGameObject(InitializeArguments arguments) {
		statsService.increaseDifficulty();
	}
	
}
