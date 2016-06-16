package dhbw.teamgold.game.common.services.providers;

import java.util.Collections;
import java.util.LinkedList;

import dhbw.teamgold.engine.service.Provider;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.services.MiniGameSelectorService;

public class MiniGameSelectorServiceProvider implements Provider<MiniGameSelectorService> {

	@Override
	public MiniGameSelectorService createService() {
		return new MinigameSelectorServiceImpl();
	}

	@Override
	public Class<MiniGameSelectorService> getType() {
		return MiniGameSelectorService.class;
	}
	
	private static class MinigameSelectorServiceImpl implements MiniGameSelectorService {

		private LinkedList<Integer> gameIds = new LinkedList<>();
		private int currentMiniGameId;
		
		public MinigameSelectorServiceImpl() {
			randomFillGameIds();
		}
		
		private void randomFillGameIds() {
			for (int i = 0; i < SceneIds.GAMES.length; i++) {
				gameIds.add(SceneIds.GAMES[i]);
			}
			Collections.shuffle(gameIds);
		}
		
		@Override
		public int getNextMiniGameId() {
			if (gameIds.isEmpty()) {
				randomFillGameIds();
			}
			
			currentMiniGameId = gameIds.poll();
			return SceneIds.GAME_2;
		}

		@Override
		public int getCurrentMiniGameId() {
			return currentMiniGameId;
		}

		@Override
		public int getCurrentWinSceneId() {
			int gameToWinScene = SceneIds.WIN_1 - SceneIds.GAME_1;
			return getCurrentMiniGameId() + gameToWinScene;
		}

		@Override
		public int getCurrentLoseSceneId() {
			int gameToLoseScene = SceneIds.LOSE_1 - SceneIds.GAME_1;
			return getCurrentMiniGameId() + gameToLoseScene;
		}
		
	}

}
