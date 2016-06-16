package dhbw.teamgold.game.statsscreen.prefabs;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.statsscreen.components.SaveGameComponent;

public class SaveGamePrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new SaveGameComponent());
	}

}
