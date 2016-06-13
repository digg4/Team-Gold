package dhbw.teamgold.game.common.prefabs;

import org.newdawn.slick.geom.Rectangle;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.common.components.GameTimeRendererComponent;

public class GameTimeDisplayPrefab extends PrototypedPrefab {
	
	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(new Rectangle(0f, 0f, 1f, 0.02f));
		GameTimeRendererComponent countdownRenderer = new GameTimeRendererComponent();
		object.addComponent(area);
		object.addComponent(countdownRenderer);
	}
}
