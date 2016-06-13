package dhbw.teamgold.game.pausemenu.prefabs;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent.RenderLayer;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.GameStatsService;
import dhbw.teamgold.game.pausemenu.components.ImageChooserLivesComponent;

public class LivesPrefab extends PrototypedPrefab {
	GameStatsService gameStatsService = Services.get(GameStatsService.class);
		@Override
	protected void initializeGameObject(GameObject object) {
			AreaComponent area = new AreaComponent(0.1f, 0.025f, 0.15f, 0.05f);
			ImageComponent image = new ImageComponent("res/gui/Button-Background.png");
			ImageRendererComponent renderer = new ImageRendererComponent(RenderLayer.GUI);
			ImageChooserLivesComponent chooser = new ImageChooserLivesComponent();
			object.addComponent(area);
			object.addComponent(image);
			object.addComponent(chooser);
			object.addComponent(renderer);		
	}

}
