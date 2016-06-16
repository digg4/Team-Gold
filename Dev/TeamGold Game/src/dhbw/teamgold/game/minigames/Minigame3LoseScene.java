package dhbw.teamgold.game.minigames;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.minigames.prefabs.PostGameCountdownPrefab;

public class Minigame3LoseScene extends Scene {

	public Minigame3LoseScene() {
		super(SceneIds.LOSE_3);
	}

	@Override
	protected void initializeGameObjects() {
		this.addGameObject(new PostGameCountdownPrefab(5));
	}

}
