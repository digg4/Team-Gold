package dhbw.teamgold.game.minigames.prefabs;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent.RenderLayer;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;

public class TrafficLightNearPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new AreaComponent(0.2f, 0.7f, 0.075f, 0.3f));
		object.addComponent(new ImageComponent("res/img/traffic-light-near-red.png"));
		object.addComponent(new ImageRendererComponent(RenderLayer.GUI));
	}

}
