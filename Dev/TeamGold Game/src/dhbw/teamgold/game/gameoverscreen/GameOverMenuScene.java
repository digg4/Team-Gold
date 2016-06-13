package dhbw.teamgold.game.gameoverscreen;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.Messages;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.prefabs.SwitchSceneButtonPrefab;
import dhbw.teamgold.game.common.prefabs.TextDisplayPrefab;

public class GameOverMenuScene extends Scene {

	public GameOverMenuScene() {
		super(SceneIds.GAME_OVER_MENU);
	}

	@Override
	protected void initializeGameObjects() {
		this.addGameObject(new TextDisplayPrefab(Messages.getString("GameOverMenu.LostGame")));
		this.addGameObject(new SwitchSceneButtonPrefab(new Rectangle(0.426f, 0.75f, 0.15f, 0.05f),
				Messages.getString("GameOverMenu.Back"), SceneIds.MAIN_MENU));
	}

}
