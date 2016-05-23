package dhbw.teamgold.game.splashscreen;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.splashscreen.prefabs.SplashScreenTimerPrefab;

public class SplashScreenScene extends Scene {

	public SplashScreenScene() {
		super(SceneIds.SPLASH_SCREEN);
	}

	@Override
	protected void initializeGameObjects() {
		this.addGameObject(new SplashScreenTimerPrefab());
	}


}
