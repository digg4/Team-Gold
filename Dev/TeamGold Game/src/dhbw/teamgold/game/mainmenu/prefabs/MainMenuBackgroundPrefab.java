package dhbw.teamgold.game.mainmenu.prefabs;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent.RenderLayer;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.Prefab;
import dhbw.teamgold.engine.core.services.GameObjectService;
import dhbw.teamgold.engine.service.Services;

public class MainMenuBackgroundPrefab implements Prefab {
	GameObjectService gameObjectService = Services.get(GameObjectService.class);

	@Override
	public GameObject getGameObject() {
		GameObject object = gameObjectService.createGameObject();
		AreaComponent area = new AreaComponent(0f, 0f, 1f, 1f);
		ImageComponent image = new ImageComponent("AlternarivGesamt.png");
		ImageRendererComponent renderer = new ImageRendererComponent(RenderLayer.BACKGROUND);
		object.addComponent(area);
		object.addComponent(image);
		object.addComponent(renderer);
		return object;
	}
}
