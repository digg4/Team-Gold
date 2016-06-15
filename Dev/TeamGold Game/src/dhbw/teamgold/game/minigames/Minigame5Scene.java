package dhbw.teamgold.game.minigames;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.prefabs.BackgroundImagePrefab;
import dhbw.teamgold.game.common.prefabs.ScoreDisplayPrefab;
import dhbw.teamgold.game.pausemenu.prefabs.LivesPrefab;

public class Minigame5Scene extends Scene {

	public Minigame5Scene() {
		super(SceneIds.GAME_5);
	}

	@Override
	protected void initializeGameObjects() {
		this.addGameObject(new BackgroundImagePrefab("res/img/game5-background.png"));
		this.addGameObject(new ScoreDisplayPrefab());
		this.addGameObject(new LivesPrefab());
	}
}
