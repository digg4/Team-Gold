package dhbw.teamgold.game.prefabs;

import org.newdawn.slick.geom.Rectangle;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.components.CountdownRendererComponent;

public class showTimerPrefab extends PrototypedPrefab {
	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(new Rectangle(0f, 0f, 1f, 0.02f));
		CountdownRendererComponent countdownRenderer = new CountdownRendererComponent();
		object.addComponent(area);
		object.addComponent(countdownRenderer);
	}
}
