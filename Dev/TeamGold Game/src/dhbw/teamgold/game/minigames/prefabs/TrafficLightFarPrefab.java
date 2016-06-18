package dhbw.teamgold.game.minigames.prefabs;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;

public class TrafficLightFarPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new AreaComponent(0.67f, 0.05f, 0.07f, 0.3f));
		object.addComponent(new ImageComponent("res/img/traffic-light-far-red.png"));
		object.addComponent(new ImageRendererComponent());
	}

}
