package dhbw.teamgold.game.minigames.prefabs;

import org.newdawn.slick.geom.Point;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.minigames.components.CableController;
import dhbw.teamgold.game.minigames.components.CableDataComponent;
import dhbw.teamgold.game.minigames.components.CableRenderer;
import dhbw.teamgold.game.minigames.components.CableResetComponent;

public class CablePrefab extends PrototypedPrefab {

	private Point start;
	private Point end;
	
	public CablePrefab(Point start, Point end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new CableDataComponent(start, end));
		object.addComponent(new CableRenderer());
		object.addComponent(new CableController());
		object.addComponent(new CableResetComponent());
	}

}
