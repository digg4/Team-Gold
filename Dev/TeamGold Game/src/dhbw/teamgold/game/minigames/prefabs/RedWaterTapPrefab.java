package dhbw.teamgold.game.minigames.prefabs;

import org.newdawn.slick.Color;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.minigames.components.WaterTapController;
import dhbw.teamgold.game.minigames.components.WaterTapRenderer;
import dhbw.teamgold.game.minigames.components.WaterTapTransform;

public class RedWaterTapPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		WaterTapTransform transform = new WaterTapTransform();
		WaterTapRenderer renderer = new WaterTapRenderer();
		WaterTapController controller = new WaterTapController();
		
		transform.setX(100);
		transform.setY(100);
		transform.setWidth(100);
		transform.setHeight(100);
		transform.setAngle(45);
		renderer.setColor(Color.red);
		
		object.addComponent(renderer);
		object.addComponent(transform);
		object.addComponent(controller);
	}

}
