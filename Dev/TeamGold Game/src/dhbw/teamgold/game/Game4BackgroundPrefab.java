package dhbw.teamgold.game;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent.RenderLayer;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;

public class Game4BackgroundPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(0, 0, 1, 1);
		ImageComponent image = new ImageComponent("res/background/Straßestreuen.png");
		ImageRendererComponent imageRenderer = new ImageRendererComponent(RenderLayer.BACKGROUND);
		object.addComponent(area);
		object.addComponent(image);
		object.addComponent(imageRenderer);		
	}
	
	
}
