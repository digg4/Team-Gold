package dhbw.teamgold.game.common.services.providers;

import dhbw.teamgold.engine.service.Inject;
import dhbw.teamgold.engine.service.Provider;
import dhbw.teamgold.game.common.services.GameStatsPersistenceService;
import dhbw.teamgold.game.common.services.HighscoreService;

public class HighscoreServiceProvider implements Provider<HighscoreService> {

	@Override
	public HighscoreService createService() {
		return new HighscoreServiceImpl();
	}

	@Override
	public Class<HighscoreService> getType() {
		return HighscoreService.class;
	}
	
	private static class HighscoreServiceImpl implements HighscoreService {
		
		@Inject
		private GameStatsPersistenceService gameStatsPersitenceService;

		@Override
		public int getHighscore() {
			return gameStatsPersitenceService.getStats().getHighscore();
		}

		@Override
		public void setHighscore(int highscore) {
			gameStatsPersitenceService.getStats().setHighscore(highscore);
		}

		@Override
		public boolean isNewHighscore(int score) {
			return score > getHighscore();
		}
	}
}
