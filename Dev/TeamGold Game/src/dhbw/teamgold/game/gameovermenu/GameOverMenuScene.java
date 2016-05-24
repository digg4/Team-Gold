package dhbw.teamgold.game.gameovermenu;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;

/**
 * This Scene will be shown when you lost the game. It contains information
 * about your score and your high-scores. You also have to option to start a new
 * game or return to the MainMenu.
 * 
 * @author Daniel Spaniol
 */
public class GameOverMenuScene extends Scene {

	public GameOverMenuScene() {
		super(SceneIds.GAME_OVER_MENU);
	}

	@Override
	protected void initializeGameObjects() {
	}

}
