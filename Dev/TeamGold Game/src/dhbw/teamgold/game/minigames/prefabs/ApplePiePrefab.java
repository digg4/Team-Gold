package dhbw.teamgold.game.minigames.prefabs;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;

public class ApplePiePrefab extends PrototypedPrefab {
	private Rectangle area;

	public ApplePiePrefab(Rectangle area) {
		this.area = area;
	}

	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new AreaComponent(area));
		object.addComponent(new ImageComponent("res/img/apple-pie.png"));
		object.addComponent(new ImageRendererComponent());
	}
}
