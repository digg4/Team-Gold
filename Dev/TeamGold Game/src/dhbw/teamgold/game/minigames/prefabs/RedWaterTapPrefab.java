package dhbw.teamgold.game.minigames.prefabs;

import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.minigames.components.WaterTapController;
import dhbw.teamgold.game.minigames.components.WaterTapRenderer;
import dhbw.teamgold.game.minigames.components.WaterTapTransfromComponent;

public class RedWaterTapPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new ImageComponent("res/img/watertap-warm.png"));
		object.addComponent(new WaterTapRenderer());
		object.addComponent(new WaterTapTransfromComponent(0.78f, 0.5f));
		object.addComponent(new WaterTapController());
	}
}
