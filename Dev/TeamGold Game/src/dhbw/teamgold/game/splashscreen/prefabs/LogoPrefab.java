package dhbw.teamgold.game.splashscreen.prefabs;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.Prefab;
import dhbw.teamgold.engine.core.exception.AssetNotFoundException;
import dhbw.teamgold.engine.core.services.AssetsService;
import dhbw.teamgold.engine.core.services.GameObjectService;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.components.AreaComponent;
import dhbw.teamgold.game.common.components.ImageComponent;
import dhbw.teamgold.game.common.components.ImageRendererComponent;

public class LogoPrefab implements Prefab {

	private GameObjectService gameObjectService = Services.get(GameObjectService.class);
	private AssetsService assetsService = Services.get(AssetsService.class);
	
	@Override
	public GameObject getGameObject() {
		GameObject gameObjcet = gameObjectService.createGameObject();
		
		addAreaComponent(gameObjcet);
		addImageComponent(gameObjcet);
		addImageRendererComponent(gameObjcet);
		
		return gameObjcet;
	}

	private void addImageRendererComponent(GameObject gameObjcet) {
		gameObjcet.addComponent(new ImageRendererComponent());
	}

	private void addImageComponent(GameObject gameObjcet) {
		ImageComponent imageComponent = new ImageComponent();
		
		try {
			imageComponent.setImage(assetsService.getImage("res/img/logo.png"));
		} catch (AssetNotFoundException e) {
			imageComponent.setImage(null);
		}
		
		gameObjcet.addComponent(imageComponent);
	}

	private void addAreaComponent(GameObject gameObjcet) {
		gameObjcet.addComponent(new AreaComponent(30, 30, 200, 200));
	}

}
