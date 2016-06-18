package dhbw.teamgold.game.mainmenu.prefabs;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent.RenderLayer;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.mainmenu.components.PlaneAnimator;

public class PlanePrefab extends PrototypedPrefab{

	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(-1f, 0.03f, 0.25f, 0.1f);
		ImageComponent image = new ImageComponent("res/background/Flugzeug.png");
		ImageRendererComponent imageRenderer = new ImageRendererComponent(RenderLayer.BACKGROUND);
		PlaneAnimator animator = new PlaneAnimator();
		
		object.addComponent(area);
		object.addComponent(image);
		object.addComponent(imageRenderer);
		object.addComponent(animator);
	}
}
