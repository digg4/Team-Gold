package dhbw.teamgold.game.minigames.components;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.GameStatsService;
import dhbw.teamgold.game.common.services.HighscoreService;

public class IncreaseScoreComponent extends Component {

	private static final int SCORE_PER_LEVEL = 1000;
	
	private GameStatsService stats = Services.get(GameStatsService.class);
	private HighscoreService highscore = Services.get(HighscoreService.class);
	
	@Override
	public void onInitializeGameObject(InitializeArguments arguments) {
		int newScore = stats.getStats().getScore() + SCORE_PER_LEVEL;
		stats.getStats().setScore(newScore);
		
		if (highscore.isNewHighscore(newScore)) {
			highscore.setHighscore(newScore);
		}
	}
	
}
