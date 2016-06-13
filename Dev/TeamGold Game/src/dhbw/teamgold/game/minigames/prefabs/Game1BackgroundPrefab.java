package dhbw.teamgold.game.minigames.prefabs;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;

public class Game1BackgroundPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(0, 0, 1, 1);
		ImageComponent image = new ImageComponent("res/img/game1-background.png");
		ImageRendererComponent renderer = new ImageRendererComponent();
		
		object.addComponent(renderer);
		object.addComponent(image);
		object.addComponent(area);
	}
}
