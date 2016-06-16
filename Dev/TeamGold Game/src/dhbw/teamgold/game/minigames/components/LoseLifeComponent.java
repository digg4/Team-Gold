package dhbw.teamgold.game.minigames.components;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.GameStatsService;

public class LoseLifeComponent extends Component {
	
	private GameStatsService gameStats = Services.get(GameStatsService.class);
	
	@Override
	public void onInitializeGameObject(InitializeArguments arguments) {
		int currentLifes = gameStats.getStats().getLives();
		gameStats.getStats().setLives(currentLifes - 1);
	}

}
