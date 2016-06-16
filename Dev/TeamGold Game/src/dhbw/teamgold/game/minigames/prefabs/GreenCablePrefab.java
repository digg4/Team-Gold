package dhbw.teamgold.game.minigames.prefabs;

import org.newdawn.slick.Color;
import org.newdawn.slick.geom.Point;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.minigames.components.CableDataComponent;

public class GreenCablePrefab extends PrototypedPrefab {

	public GreenCablePrefab(Point start, Point end) {
		super(new CablePrefab(start, end));
	}	
	
	@Override
	protected void initializeGameObject(GameObject object) {
		object.getComponent(CableDataComponent.class).setColor(Color.green);
	}
	
}
