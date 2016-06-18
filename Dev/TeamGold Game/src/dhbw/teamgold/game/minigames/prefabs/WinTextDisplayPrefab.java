package dhbw.teamgold.game.minigames.prefabs;

import org.newdawn.slick.Color;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.TextComponent;
import dhbw.teamgold.engine.components.TextRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;

public class WinTextDisplayPrefab extends PrototypedPrefab {
	
	@Override
	protected void initializeGameObject(GameObject object) {
		TextComponent textComponent = new TextComponent("WIN");
		TextRendererComponent textRenderer = new TextRendererComponent();
		AreaComponent areaComponent = new AreaComponent(0, 0, 1, 1);

		textRenderer.setTextColor(Color.white);
//		textRenderer.setFont(new UnicodeFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20)));
		
		object.addComponent(textComponent);
		object.addComponent(textRenderer);
		object.addComponent(areaComponent);
	}

}
