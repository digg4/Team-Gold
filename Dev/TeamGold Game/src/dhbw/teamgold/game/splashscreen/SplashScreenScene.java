package dhbw.teamgold.game.splashscreen;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.splashscreen.prefabs.LogoPrefab;

public class SplashScreenScene extends Scene {

	public SplashScreenScene() {
		super(SceneIds.SPLASH_SCREEN);
	}

	@Override
	protected void initializeGameObjects() {
		addGameObject(new LogoPrefab());
	}

}
