package dhbw.teamgold.game.minigames.prefabs;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent.RenderLayer;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;

public class TrashBinPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new AreaComponent(0.4f, 0.4f, 0.2f, 0.6f));
		object.addComponent(new ImageComponent("res/img/trash-bin.png"));
		object.addComponent(new ImageRendererComponent(RenderLayer.GUI));
	}

}
