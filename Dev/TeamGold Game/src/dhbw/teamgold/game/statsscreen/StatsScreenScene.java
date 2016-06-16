package dhbw.teamgold.game.statsscreen;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.prefabs.GameTimeDisplayPrefab;
import dhbw.teamgold.game.common.services.GameStatsService;
import dhbw.teamgold.game.common.services.GameTimeService;
import dhbw.teamgold.game.common.services.MiniGameSelectorService;
import dhbw.teamgold.game.statsscreen.prefabs.CountdownPrefab;
import dhbw.teamgold.game.statsscreen.prefabs.LivesStatsPrefab;
import dhbw.teamgold.game.statsscreen.prefabs.PointsStatsPrefab;

public class StatsScreenScene extends Scene {

	private MiniGameSelectorService selector = Services.get(MiniGameSelectorService.class);
	private GameTimeService gameTime = Services.get(GameTimeService.class);
	private GameStatsService stats = Services.get(GameStatsService.class);

	private CountdownPrefab countdown = new CountdownPrefab(() -> {
		if (stats.getStats().getLives() <= 0) {
			this.switchScene(SceneIds.GAME_OVER_MENU);
		} else if (gameTime.isTimeOver()) {
			this.switchScene(SceneIds.TIME_OVER_MENU);
		} else {
			this.switchScene(selector.getNextMiniGameId());
		}
	});

	public StatsScreenScene() {
		super(SceneIds.STATS_SCREEN);
	}

	@Override
	protected void initializeGameObjects() {
		this.addGameObject(new GameTimeDisplayPrefab());
		this.addGameObject(new LivesStatsPrefab());
		this.addGameObject(new PointsStatsPrefab());
		this.addGameObject(new StatsHighscorePrefab());
		this.addGameObject(countdown);

	}

}
