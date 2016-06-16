package dhbw.teamgold.game.minigames.prefabs;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.minigames.components.GameCountdownComponent;
import dhbw.teamgold.game.minigames.components.GameCountdownRenderer;

public class GameCountdownDisplayPrefab extends PrototypedPrefab {

	private static final Rectangle BOUNDS = new Rectangle(0.01f, 0.01f, 0.05f, 0.05f);
	
	private float initialSeconds;
	private float secondsLostPerDifficulty;
	
	public GameCountdownDisplayPrefab(float initialSeconds, float secondsLostPerDifficulty) {
		this.initialSeconds = initialSeconds;
		this.secondsLostPerDifficulty = secondsLostPerDifficulty;
	}
	
	@Override
	protected void initializeGameObject(GameObject object) {
		GameCountdownComponent countdownComponent = new GameCountdownComponent();
		GameCountdownRenderer countdownRenderer = new GameCountdownRenderer();
		AreaComponent area = new AreaComponent(BOUNDS);

		countdownComponent.init(initialSeconds, secondsLostPerDifficulty);
		
		object.addComponent(countdownComponent);
		object.addComponent(countdownRenderer);
		object.addComponent(area);
	}
}
