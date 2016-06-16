package dhbw.teamgold.game.minigames.prefabs;

import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.minigames.components.WaterTapRenderer;
import dhbw.teamgold.game.minigames.components.WaterTapTransfromComponent;

public class BlueWaterTapPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new WaterTapRenderer());
		object.addComponent(new ImageComponent("res/img/watertap-cold.png"));
		object.addComponent(new WaterTapTransfromComponent(0.58f, 0.3f));
	}
}
