package dhbw.teamgold.game.common.services.providers;

import dhbw.teamgold.engine.service.Provider;
import dhbw.teamgold.game.common.TransientGameStats;
import dhbw.teamgold.game.common.services.GameStatsService;

public class GameStatsServiceProvider implements Provider<GameStatsService> {

	@Override
	public GameStatsService createService() {
		return new GameStatsServiceImpl();
	}

	@Override
	public Class<GameStatsService> getType() {
		return GameStatsService.class;
	}
	
	private static class GameStatsServiceImpl implements GameStatsService {

		private static final int START_LIVES = 3;
		private static final int START_SCORE = 0;
		private static final int START_DIFFICULTY = 20;
		
		private TransientGameStats stats;
		
		public GameStatsServiceImpl() {
			resetStats();
		}
		
		@Override
		public TransientGameStats getStats() {
			return stats;
		}

		@Override
		public void resetStats() {
			stats = new TransientGameStats();
			stats.setLives(START_LIVES);
			stats.setScore(START_SCORE);
			stats.setDifficulty(START_DIFFICULTY);
		}

		@Override
		public void addScore(int scoreToAdd) {
			stats.setScore(stats.getScore() + scoreToAdd);
		}

		@Override
		public void loseLive() {
			stats.setLives(stats.getLives() - 1);
		}

		@Override
		public boolean isGameOver() {
			return stats.getLives() <= 0;
		}

		@Override
		public void increaseDifficulty() {
			stats.setDifficulty(stats.getDifficulty() + 1);
		}
	}
}
