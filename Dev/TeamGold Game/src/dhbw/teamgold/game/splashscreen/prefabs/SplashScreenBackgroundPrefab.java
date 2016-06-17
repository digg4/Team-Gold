package dhbw.teamgold.game.splashscreen.prefabs;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent.RenderLayer;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;

public class SplashScreenBackgroundPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(0f,0f,1f,1f);
		ImageComponent image = new ImageComponent("res/background/logo2.png");
		ImageRendererComponent imageRenderer = new ImageRendererComponent(RenderLayer.BACKGROUND);
		object.addComponent(area);
		object.addComponent(image);
		object.addComponent(imageRenderer);
	}

}
