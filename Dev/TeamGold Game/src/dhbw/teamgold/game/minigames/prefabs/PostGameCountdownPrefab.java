package dhbw.teamgold.game.minigames.prefabs;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.minigames.components.PostgameCountdownComponent;

public class PostGameCountdownPrefab extends PrototypedPrefab {

	private final float initialSeconds;
	
	public PostGameCountdownPrefab(float initialSeconds) {
		this.initialSeconds = initialSeconds;
	}	
	
	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new PostgameCountdownComponent(initialSeconds));
	}

}
