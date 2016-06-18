package dhbw.teamgold.game.minigames.prefabs;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.minigames.components.DownCarBoundsCollider;
import dhbw.teamgold.game.minigames.components.DownCarController;
import dhbw.teamgold.game.minigames.components.DownCarImageChooserComponent;

public class DownCarPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new AreaComponent(1f, 0.33f, 0.3f, 0.2f));
		object.addComponent(new ImageRendererComponent());
		object.addComponent(new ImageComponent("res/img/car black.png"));
		object.addComponent(new DownCarController());
		object.addComponent(new DownCarBoundsCollider());
		object.addComponent(new DownCarImageChooserComponent());
	}

}
