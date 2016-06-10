package dhbw.teamgold.game.mainmenu.prefabs;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.TextComponent;
import dhbw.teamgold.engine.components.TextRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;

public class HighscorePrefab extends PrototypedPrefab {

	private static final Rectangle BOUNDS = new Rectangle(0.75f, 0.75f, 0.25f, 0.1f);
	
	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(BOUNDS);
		TextComponent text = new TextComponent("HIGHSCORE\n" + "No Highscore available");
		TextRendererComponent textRendererComponent = new TextRendererComponent();
		
		object.addComponent(area);
		object.addComponent(text);
		object.addComponent(textRendererComponent);

	}

}
