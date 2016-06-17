package dhbw.teamgold.game.splashscreen;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.splashscreen.prefabs.SplashScreenBackgroundPrefab;
import dhbw.teamgold.game.statsscreen.prefabs.CountdownPrefab;

public class SplashScreenScene extends Scene {

	public SplashScreenScene() {
		super(SceneIds.SPLASH_SCREEN);
	}
	private CountdownPrefab countdown = new CountdownPrefab(() -> {
		
			this.switchScene(SceneIds.MAIN_MENU);
		
	});


	@Override
	protected void initializeGameObjects() {
		this.addGameObject(countdown);
		this.addGameObject(new SplashScreenBackgroundPrefab());
	}

}
