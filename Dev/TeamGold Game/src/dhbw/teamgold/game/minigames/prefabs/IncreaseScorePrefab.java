package dhbw.teamgold.game.minigames.prefabs;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.minigames.components.IncreaseScoreComponent;

public class IncreaseScorePrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new IncreaseScoreComponent());
	}
}
