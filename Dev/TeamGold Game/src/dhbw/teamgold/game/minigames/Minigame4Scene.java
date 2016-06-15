package dhbw.teamgold.game.minigames;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.prefabs.BackgroundImagePrefab;
import dhbw.teamgold.game.common.prefabs.ScoreDisplayPrefab;
import dhbw.teamgold.game.pausemenu.prefabs.LivesPrefab;

public class Minigame4Scene extends Scene {

	public Minigame4Scene() {
		super(SceneIds.GAME_4);
	}

	@Override
	protected void initializeGameObjects() {
		this.addGameObject(new BackgroundImagePrefab("res/img/game4-background.png"));
		this.addGameObject(new ScoreDisplayPrefab());
		this.addGameObject(new LivesPrefab());
	}
}
