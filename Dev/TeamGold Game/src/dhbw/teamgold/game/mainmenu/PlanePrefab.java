package dhbw.teamgold.game.mainmenu;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent.RenderLayer;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;

public class PlanePrefab extends PrototypedPrefab{

	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(0.45f, 0.03f, 0.5f, 0.2f);
		
		ImageComponent image = new ImageComponent("res/background/Flugzeug.png");
		ImageRendererComponent imageRenderer = new ImageRendererComponent(RenderLayer.BACKGROUND);
		object.addComponent(area);
		object.addComponent(image);
		object.addComponent(imageRenderer);
		
	}
	

}
