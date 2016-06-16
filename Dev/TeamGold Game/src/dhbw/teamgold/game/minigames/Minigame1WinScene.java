package dhbw.teamgold.game.minigames;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.minigames.prefabs.IncreaseDifficultyPrefab;
import dhbw.teamgold.game.minigames.prefabs.IncreaseScorePrefab;
import dhbw.teamgold.game.minigames.prefabs.PostGameCountdownPrefab;

public class Minigame1WinScene extends Scene {

	public Minigame1WinScene() {
		super(SceneIds.WIN_1);
	}

	@Override
	protected void initializeGameObjects() {
		this.addGameObject(new PostGameCountdownPrefab(5));
		this.addGameObject(new IncreaseScorePrefab());
		this.addGameObject(new IncreaseDifficultyPrefab());
	}
}
