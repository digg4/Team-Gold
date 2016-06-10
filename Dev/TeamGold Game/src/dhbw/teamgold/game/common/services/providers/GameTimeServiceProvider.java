package dhbw.teamgold.game.common.services.providers;

import dhbw.teamgold.engine.service.Inject;
import dhbw.teamgold.engine.service.Provider;
import dhbw.teamgold.game.common.services.GameStatsPersistenceService;
import dhbw.teamgold.game.common.services.GameTimeService;

public class GameTimeServiceProvider implements Provider<GameTimeService> {

	@Override
	public GameTimeService createService() {
		return new GameTimeServiceImpl();
	}

	@Override
	public Class<GameTimeService> getType() {
		return GameTimeService.class;
	}

	private static class GameTimeServiceImpl implements GameTimeService {

		private static final int MINUTES_TO_PLAY = 15;
		private static final int MINUTES_TO_WAIT = 45;

		private static final long MILISECONDS_TO_PLAY = MINUTES_TO_PLAY * 60 * 1000;
		private static final long MILISECONDS_TO_WAIT = MINUTES_TO_WAIT * 60 * 1000;

		@Inject
		private GameStatsPersistenceService gameStatsPersistenceService;

		@Override
		public boolean isTimeOver() {
			long lastGameStart = gameStatsPersistenceService.getStats().getGameStart();

			if (waitTimeHasPassed(lastGameStart)) {
				return false;
			}

			return gameTimeHasPassed(lastGameStart);
		}

		private boolean waitTimeHasPassed(long lastGameStart) {
			return System.currentTimeMillis() - lastGameStart > MILISECONDS_TO_WAIT + MILISECONDS_TO_PLAY;
		}

		private boolean gameTimeHasPassed(long lastGameStart) {
			return System.currentTimeMillis() - lastGameStart > MILISECONDS_TO_PLAY;
		}

		@Override
		public boolean isTimeTicking() {
			long lastGameStart = gameStatsPersistenceService.getStats().getGameStart();

			return !gameTimeHasPassed(lastGameStart);
		}

		@Override
		public void startTimeTicking() {
			gameStatsPersistenceService.getStats().setGameStart(System.currentTimeMillis());
		}

		@Override
		public double getPercentOfTimeOver() {
			if (!isTimeTicking()) {
				return 0;
			}

			long milisecondsPassed = System.currentTimeMillis() - gameStatsPersistenceService.getStats().getGameStart();
			return Math.min(1, (milisecondsPassed / (double) MILISECONDS_TO_PLAY));
		}
	}
}
