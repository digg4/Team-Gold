package dhbw.teamgold.game.minigames;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.minigames.prefabs.PostGameCountdownPrefab;

public class Minigame2WinScene extends Scene {

	public Minigame2WinScene() {
		super(SceneIds.WIN_2);
	}

	@Override
	protected void initializeGameObjects() {
		this.addGameObject(new PostGameCountdownPrefab(5));
	}
}
