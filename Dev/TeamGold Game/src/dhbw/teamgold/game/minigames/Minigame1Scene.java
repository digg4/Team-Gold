package dhbw.teamgold.game.minigames;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.prefabs.BackgroundImagePrefab;
import dhbw.teamgold.game.common.prefabs.ScoreDisplayPrefab;
import dhbw.teamgold.game.minigames.prefabs.BlueWaterTapPrefab;
import dhbw.teamgold.game.minigames.prefabs.GameCountdownDisplayPrefab;
import dhbw.teamgold.game.minigames.prefabs.GameInfoTextDisplayPrefab;
import dhbw.teamgold.game.minigames.prefabs.RedWaterTapPrefab;
import dhbw.teamgold.game.pausemenu.prefabs.LivesPrefab;

public class Minigame1Scene extends Scene {

	private static final float DEFAULT_TIME = 8f;
	private static final float DIFFICULTY_FACTOR = 0.15f;
	
	public Minigame1Scene() {
		super(SceneIds.GAME_1);
	}

	@Override
	protected void initializeGameObjects() {
		this.addGameObject(new BackgroundImagePrefab("res/img/game1-background.png"));
		this.addGameObject(new GameInfoTextDisplayPrefab(getID()));
		this.addGameObject(new BlueWaterTapPrefab());
		this.addGameObject(new RedWaterTapPrefab());
		this.addGameObject(new ScoreDisplayPrefab());
		this.addGameObject(new LivesPrefab());
		this.addGameObject(new GameCountdownDisplayPrefab(DEFAULT_TIME, DIFFICULTY_FACTOR));
	}
}
