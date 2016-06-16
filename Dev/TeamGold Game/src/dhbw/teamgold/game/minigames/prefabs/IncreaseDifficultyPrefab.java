package dhbw.teamgold.game.minigames.prefabs;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.minigames.components.IncreaseDifficultyComponent;

public class IncreaseDifficultyPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new IncreaseDifficultyComponent());
	}

}
