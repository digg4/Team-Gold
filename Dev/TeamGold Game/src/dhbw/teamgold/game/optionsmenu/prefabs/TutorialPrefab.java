package dhbw.teamgold.game.optionsmenu.prefabs;

import org.newdawn.slick.Color;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.TextComponent;
import dhbw.teamgold.engine.components.TextRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.Messages;

public class TutorialPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(0.23f,0.5f ,0.3f, 0.3f);
		TextComponent text = new TextComponent(Messages.getString("OptionsMenu.Tutorial"));
		TextRendererComponent renderer = new TextRendererComponent();
		renderer.setTextColor(Color.white);
		object.addComponent(area);
		object.addComponent(text);
		object.addComponent(renderer);
		
	}

}
