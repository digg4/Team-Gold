package dhbw.teamgold.game.minigames;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.minigames.prefabs.Game1BackgroundPrefab;
import dhbw.teamgold.game.minigames.prefabs.RedWaterTapPrefab;

public class Minigame1Scene extends Scene {

	public Minigame1Scene() {
		super(SceneIds.GAME_1);
	}

	@Override
	protected void initializeGameObjects() {
		addGameObject(new Game1BackgroundPrefab());
		addGameObject(new RedWaterTapPrefab());
	}

}
