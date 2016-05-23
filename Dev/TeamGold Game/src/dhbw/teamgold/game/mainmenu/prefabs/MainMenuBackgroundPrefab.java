package dhbw.teamgold.game.mainmenu.prefabs;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.Prefab;
import dhbw.teamgold.engine.core.services.GameObjectService;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.mainmenu.components.MainMenuBackgroundRendererComponent;

public class MainMenuBackgroundPrefab implements Prefab {
	
	GameObjectService gameObjectService = Services.get(GameObjectService.class);

	@Override
	public GameObject getGameObject() {
		GameObject object = gameObjectService.createGameObject();
		
		object.addComponent(new MainMenuBackgroundRendererComponent());
		
		return object;
	}

}
