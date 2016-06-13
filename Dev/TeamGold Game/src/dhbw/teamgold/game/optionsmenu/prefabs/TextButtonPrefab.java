package dhbw.teamgold.game.optionsmenu.prefabs;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.TextComponent;
import dhbw.teamgold.engine.components.TextRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;

public class TextButtonPrefab extends PrototypedPrefab{

	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(0.4f,0.4f, 0.05f, 0.05f);
		TextComponent text = new TextComponent("Sound deaktivieren");
		TextRendererComponent renderer = new TextRendererComponent();
		object.addComponent(area);
		object.addComponent(text);
		object.addComponent(renderer);
		
		
	}

}
