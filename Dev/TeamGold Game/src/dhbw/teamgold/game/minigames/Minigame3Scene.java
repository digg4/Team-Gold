package dhbw.teamgold.game.minigames;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.prefabs.GameTimeDisplayPrefab;
import dhbw.teamgold.game.common.prefabs.ScoreDisplayPrefab;
import dhbw.teamgold.game.minigames.prefabs.Game1BackgroundPrefab;
import dhbw.teamgold.game.minigames.prefabs.Game2BackgroundPrefab;
import dhbw.teamgold.game.minigames.prefabs.Game3BackgroundPrefab;
import dhbw.teamgold.game.minigames.prefabs.PauseButtonPrefab;
import dhbw.teamgold.game.minigames.prefabs.RedWaterTapPrefab;
import dhbw.teamgold.game.pausemenu.prefabs.LivesPrefab;

public class Minigame3Scene extends Scene {

	public Minigame3Scene() {
		super(SceneIds.GAME_3);
	}

	@Override
	protected void initializeGameObjects() {

		this.addGameObject(new PauseButtonPrefab());
		this.addGameObject(new GameTimeDisplayPrefab());
		this.addGameObject(new ScoreDisplayPrefab());
		this.addGameObject(new LivesPrefab());
		this.addGameObject(new Game3BackgroundPrefab());

	}
}
