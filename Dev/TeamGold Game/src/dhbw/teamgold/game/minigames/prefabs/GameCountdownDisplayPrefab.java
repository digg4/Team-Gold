package dhbw.teamgold.game.minigames.prefabs;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.minigames.components.GameCountdownComponent;
import dhbw.teamgold.game.minigames.components.GameCountdownRenderer;

public class GameCountdownDisplayPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new GameCountdownComponent());
		object.addComponent(new GameCountdownRenderer());
	}
}
