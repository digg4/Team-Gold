package dhbw.teamgold.game.minigames;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.minigames.prefabs.PostGameCountdownPrefab;

public class Minigame1LoseScene extends Scene {

	public Minigame1LoseScene() {
		super(SceneIds.LOSE_1);
	}

	@Override
	protected void initializeGameObjects() {
		this.addGameObject(new PostGameCountdownPrefab(5));
	}

}
