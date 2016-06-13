package dhbw.teamgold.game.gameoverscreen;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.components.GeneralButtonPrefab;
import dhbw.teamgold.game.common.prefabs.TextPlacePrefab;

public class GameOverMenuScene extends Scene {

	public GameOverMenuScene() {
		super(SceneIds.GAME_OVER_MENU);
	}

	@Override
	protected void initializeGameObjects() {
		this.addGameObject(new TextPlacePrefab("GameOver\nYou just lost your last live."));
		this.addGameObject(new GeneralButtonPrefab(new Rectangle(0.426f, 0.75f, 0.15f, 0.05f),"Back to Main Menu", SceneIds.MAIN_MENU));
	}

}
