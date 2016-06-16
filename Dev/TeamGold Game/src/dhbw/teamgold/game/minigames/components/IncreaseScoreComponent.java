package dhbw.teamgold.game.minigames.components;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.GameStatsService;

public class IncreaseScoreComponent extends Component {

	private static final int SCORE_PER_LEVEL = 1000;
	
	private GameStatsService stats = Services.get(GameStatsService.class);
	
	@Override
	public void onInitializeGameObject(InitializeArguments arguments) {
		int currentScore = stats.getStats().getScore();
		stats.getStats().setScore(currentScore + SCORE_PER_LEVEL);
	}
	
}
