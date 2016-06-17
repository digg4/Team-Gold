package dhbw.teamgold.game.minigames.prefabs;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.minigames.components.PhysicsComponent;
import dhbw.teamgold.game.minigames.components.TrashBoundsColider;
import dhbw.teamgold.game.minigames.components.TrashController;

public class TrashPrefab extends PrototypedPrefab {

	private Rectangle area;
	
	public TrashPrefab(Rectangle area) {
		this.area = area;
	}
	
	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new ImageComponent("res/img/trash.png"));
		object.addComponent(new ImageRendererComponent());
		object.addComponent(new AreaComponent(area));
		object.addComponent(new PhysicsComponent());
		object.addComponent(new TrashController());
		object.addComponent(new TrashBoundsColider());
	}

}
