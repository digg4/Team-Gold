package dhbw.teamgold.game.splashscreen.prefabs;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.Prefab;
import dhbw.teamgold.engine.core.services.GameObjectService;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.components.CountdownComponent;
import dhbw.teamgold.game.splashscreen.components.SplashScreenTimerRendererComponent;

public class SplashScreenTimerPrefab implements Prefab {

	public static final double SPLASH_SCREEN_DURATION_IN_SECONDS = 5;
	
	private GameObjectService gameObjectService = Services.get(GameObjectService.class);
	
	@Override
	public GameObject getGameObject() {
		GameObject object = gameObjectService.createGameObject();

		addCountdownComponent(object);
		addRendererComponent(object);
		
		return object;
	}

	private void addRendererComponent(GameObject object) {
		SplashScreenTimerRendererComponent rendererComponent = new SplashScreenTimerRendererComponent();
		object.addComponent(rendererComponent);
	}

	private void addCountdownComponent(GameObject object) {
		CountdownComponent countdownComponent = new CountdownComponent();
		countdownComponent.init(SPLASH_SCREEN_DURATION_IN_SECONDS);
		countdownComponent.onCountdownEnd(() -> object.getScene().switchScene(SceneIds.MAIN_MENU));
		object.addComponent(countdownComponent);
	}


}
