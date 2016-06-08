package dhbw.teamgold.game.common.services.providers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import dhbw.teamgold.engine.service.Provider;
import dhbw.teamgold.game.common.PersistentGameStats;
import dhbw.teamgold.game.common.services.GameStatsPersistenceService;

public class GameStatsPersistenceServiceProvider implements Provider<GameStatsPersistenceService> {

	@Override
	public GameStatsPersistenceService createService() {
		return new GameStatsPersistenceServiceImpl();
	}
	
	@Override
	public Class<GameStatsPersistenceService> getType() {
		return GameStatsPersistenceService.class;
	}
	
	
	private static class GameStatsPersistenceServiceImpl implements GameStatsPersistenceService {

		private static final String FILE_NAME = "test.savegame";
		
		private PersistentGameStats stats = null;
		
		@Override
		public PersistentGameStats getStats() {
			if (stats == null) {
				if (Files.exists(Paths.get(FILE_NAME))) {
					loadStatsFromFile();
				} else {
					createNewStats();
				}
			}
			return stats;
		}
		
		private void loadStatsFromFile() {
			try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
				stats = (PersistentGameStats) stream.readObject();
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
		}
		
		private void createNewStats() {
			stats = new PersistentGameStats();
			
			stats.setHighscore(0);
			stats.setGameStart(0);
		}

		@Override
		public void saveStats() {
			try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
				stream.writeObject(stats);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
