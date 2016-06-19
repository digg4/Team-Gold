package dhbw.teamgold.game.common.services.providers;

import dhbw.teamgold.engine.service.Inject;
import dhbw.teamgold.engine.service.Provider;
import dhbw.teamgold.game.common.services.GameStatsService;
import dhbw.teamgold.game.common.services.WinLoseService;
import dhbw.teamgold.game.common.services.WinLoseTextService;

public class WinLoseServiceProvider implements Provider<WinLoseService> {

	@Override
	public WinLoseService createService() {
		return new WinLoseServiceImpl();
	}

	@Override
	public Class<WinLoseService> getType() {
		return WinLoseService.class;
	}
	
	private static class WinLoseServiceImpl implements WinLoseService {

		private static final int SCORE_PER_WIN = 1000;
		
		@Inject
		private WinLoseTextService winLoseTextService;
		
		@Inject
		private GameStatsService gameStatsService;
		
		@Override
		public void win() {
			winLoseTextService.loadNextWinText();
			gameStatsService.increaseDifficulty();
			gameStatsService.addScore(SCORE_PER_WIN);
		}

		@Override
		public void lose() {
			winLoseTextService.loadNextLoseText();
			gameStatsService.loseLive();
		}
		
	}

}
