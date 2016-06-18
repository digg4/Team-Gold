package dhbw.teamgold.game.minigames.prefabs;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.minigames.components.UpCarBoundsCollider;
import dhbw.teamgold.game.minigames.components.UpCarController;
import dhbw.teamgold.game.minigames.components.UpCarImageChooserComponent;

public class UpCarPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new AreaComponent(-0.3f, 0.8f, 0.3f, 0.2f));
		object.addComponent(new ImageRendererComponent());
		object.addComponent(new ImageComponent("res/img/car silver up.png"));
		object.addComponent(new UpCarController());
		object.addComponent(new UpCarBoundsCollider());
		object.addComponent(new UpCarImageChooserComponent());
	}

}
