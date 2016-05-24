package dhbw.teamgold.game.splashscreen;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;

/**
 * The SplashScreen is the first thing you see when you enter the game. Its
 * purpose is to show some kind of logo or initial load animation when the game
 * starts. <br/>
 * After all resources are loaded or after a given time this Scene should lead
 * into the MainMenu.
 * 
 * @author Daniel Spaniol
 */
public class SplashScreenScene extends Scene {

	public SplashScreenScene() {
		super(SceneIds.SPLASH_SCREEN);
	}

	@Override
	protected void initializeGameObjects() {
	}

}
