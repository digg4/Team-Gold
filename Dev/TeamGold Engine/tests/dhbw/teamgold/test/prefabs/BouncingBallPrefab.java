package dhbw.teamgold.test.prefabs;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.Prefab;
import dhbw.teamgold.engine.core.services.GameObjectService;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.test.components.AreaComponent;
import dhbw.teamgold.test.components.BallControllerComponent;
import dhbw.teamgold.test.components.BallMoveComponent;
import dhbw.teamgold.test.components.BallRendererComponent;
import dhbw.teamgold.test.components.BallScoreComponent;

public class BouncingBallPrefab implements Prefab {

	@Override
	public GameObject getGameObject() {
		GameObjectService service = Services.get(GameObjectService.class);
		GameObject object = service.createGameObject();
		
		AreaComponent areaComponent = new AreaComponent();
		BallMoveComponent ballMoveComponent = new BallMoveComponent();
		BallRendererComponent ballRendererComponent = new BallRendererComponent();
		BallControllerComponent ballControllerComponent = new BallControllerComponent();
		BallScoreComponent ballScoreComponent = new BallScoreComponent();
		
		areaComponent.setArea(new Rectangle(100, 100, 40, 40));
		
		object.addComponent(areaComponent);
		object.addComponent(ballMoveComponent);
		object.addComponent(ballRendererComponent);
		object.addComponent(ballControllerComponent);
		object.addComponent(ballScoreComponent);
		
		return object;
	}

}
