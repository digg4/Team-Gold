package dhbw.teamgold.game.mainmenu;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;

/**
 * The MainMenu is the first thing you will see after the SplashScreen. From
 * here you will be able to enter the options-menu or start games. The MainMenu
 * should also display some useful information like the time you have left to
 * play. You will be able to access the MainMenu from nearly every other Scene.
 * 
 * @author Daniel Spaniol
 */
public class MainMenuScene extends Scene {

	public MainMenuScene() {
		super(SceneIds.MAIN_MENU);
	}

	@Override
	protected void initializeGameObjects() {
	}

}
