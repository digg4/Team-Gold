package dhbw.teamgold.game.minigames;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.minigames.prefabs.LoseLifePrefab;
import dhbw.teamgold.game.minigames.prefabs.PostGameCountdownPrefab;

public class Minigame2LoseScene extends Scene {

	public Minigame2LoseScene() {
		super(SceneIds.LOSE_2);
	}

	@Override
	protected void initializeGameObjects() {
		this.addGameObject(new PostGameCountdownPrefab(5));
		this.addGameObject(new LoseLifePrefab());
	}

}
