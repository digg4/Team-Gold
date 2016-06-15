package dhbw.teamgold.game.minigames.prefabs;

import org.newdawn.slick.Color;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.minigames.components.WaterTapDebugRenderer;
import dhbw.teamgold.game.minigames.components.WaterTapTransfromComponent;

public class BlueWaterTapPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new WaterTapDebugRenderer(Color.blue));
		object.addComponent(new WaterTapTransfromComponent(0.3f, 0.3f));
	}
}
