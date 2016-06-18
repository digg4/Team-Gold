package dhbw.teamgold.game.minigames;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.minigames.prefabs.IncreaseDifficultyPrefab;
import dhbw.teamgold.game.minigames.prefabs.IncreaseScorePrefab;
import dhbw.teamgold.game.minigames.prefabs.PostGameCountdownPrefab;
import dhbw.teamgold.game.minigames.prefabs.WinTextDisplayPrefab;

public class GenericWinScene extends Scene {

	public GenericWinScene() {
		super(SceneIds.GENERIC_WIN);
	}

	@Override
	protected void initializeGameObjects() {
		this.addGameObject(new PostGameCountdownPrefab(1));
		this.addGameObject(new IncreaseScorePrefab());
		this.addGameObject(new IncreaseDifficultyPrefab());
		this.addGameObject(new WinTextDisplayPrefab());
	}

}
