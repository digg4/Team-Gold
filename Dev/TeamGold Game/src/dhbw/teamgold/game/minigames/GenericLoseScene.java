package dhbw.teamgold.game.minigames;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.minigames.prefabs.LoseLifePrefab;
import dhbw.teamgold.game.minigames.prefabs.LoseTextDisplayPrefab;
import dhbw.teamgold.game.minigames.prefabs.PostGameCountdownPrefab;

public class GenericLoseScene extends Scene {

	public GenericLoseScene() {
		super(SceneIds.GENERIC_LOSE);
	}

	@Override
	protected void initializeGameObjects() {
		this.addGameObject(new PostGameCountdownPrefab(1));
		this.addGameObject(new LoseLifePrefab());
		this.addGameObject(new LoseTextDisplayPrefab());
	}
}
