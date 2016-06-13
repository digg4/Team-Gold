package dhbw.teamgold.game.statsscreen;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.prefabs.showTimerPrefab;
import dhbw.teamgold.game.statsscreen.prefabs.CountdownPrefab;
import dhbw.teamgold.game.statsscreen.prefabs.LivesStatsPrefab;
import dhbw.teamgold.game.statsscreen.prefabs.PointsStatsPrefab;

public class StatsScreenScene extends Scene {

	private CountdownPrefab countdown = new CountdownPrefab(() -> {
		
				this.switchScene(SceneIds.MAIN_MENU); 
			});
	public StatsScreenScene() {
		super(SceneIds.STATS_SCREEN);
	}

	@Override
	protected void initializeGameObjects() {
	
		this.addGameObject(new showTimerPrefab());
		this.addGameObject(new LivesStatsPrefab());
		this.addGameObject(new PointsStatsPrefab());
		this.addGameObject(countdown);

	}

}
