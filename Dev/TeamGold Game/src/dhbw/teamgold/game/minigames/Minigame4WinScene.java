package dhbw.teamgold.game.minigames;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.minigames.prefabs.IncreaseScorePrefab;
import dhbw.teamgold.game.minigames.prefabs.PostGameCountdownPrefab;

public class Minigame4WinScene extends Scene {

	public Minigame4WinScene() {
		super(SceneIds.WIN_4);
	}

	@Override
	protected void initializeGameObjects() {
		this.addGameObject(new PostGameCountdownPrefab(5));
		this.addGameObject(new IncreaseScorePrefab());
	}
}
