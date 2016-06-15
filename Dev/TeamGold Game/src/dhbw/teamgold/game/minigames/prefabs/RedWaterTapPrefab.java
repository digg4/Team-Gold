package dhbw.teamgold.game.minigames.prefabs;

import org.newdawn.slick.Color;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.minigames.components.WaterTapDebugRenderer;
import dhbw.teamgold.game.minigames.components.WaterTapController;
import dhbw.teamgold.game.minigames.components.WaterTapTransfromComponent;

public class RedWaterTapPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new WaterTapDebugRenderer(Color.red));
		object.addComponent(new WaterTapTransfromComponent(0.7f, 0.3f));
		object.addComponent(new WaterTapController());
	}
}
