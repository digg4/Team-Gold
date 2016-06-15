package dhbw.teamgold.game.optionsmenu.prefabs;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent.RenderLayer;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.optionsmenu.components.ButtonHandlerSound;

public class SoundButtonPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(0.075f,0.34f,0.1f,0.15f);
		ImageComponent image = new ImageComponent("res/gui/SchalterOn.png");
		ImageRendererComponent renderer = new ImageRendererComponent(RenderLayer.GUI);
		object.addComponent(area);
		object.addComponent(image);
		object.addComponent(renderer);
		object.addComponent(new ButtonHandlerSound());
		
	}
	
}
