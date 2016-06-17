package dhbw.teamgold.game.minigames.prefabs;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent.RenderLayer;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.minigames.components.FoodCoverAnimator;
import dhbw.teamgold.game.minigames.components.FoodCoverController;
import dhbw.teamgold.game.minigames.components.FoodCoverController.OnClickAction;

public class FoodCoverPrefab extends PrototypedPrefab {
	
	private OnClickAction action;
	private Rectangle clickArea;
	
	public FoodCoverPrefab(OnClickAction onclick, Rectangle clickArea) {
		action = onclick;
		this.clickArea = clickArea;
	}

	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new AreaComponent(clickArea));
		object.addComponent(new ImageComponent("res/img/food-cover.png"));
		object.addComponent(new ImageRendererComponent(RenderLayer.GUI));
		object.addComponent(new FoodCoverAnimator());
		object.addComponent(new FoodCoverController(action));
	}

}
