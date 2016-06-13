package dhbw.teamgold.game.mainmenu.prefabs;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.common.components.RectangeRendererComponent;

public class ButtonBackGroundPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(new Rectangle(0.005f, 0.78f, 0.16f, 0.19f));
		RectangeRendererComponent drawer = new RectangeRendererComponent();
		object.addComponent(drawer);
		object.addComponent(area);
		
	}

}
