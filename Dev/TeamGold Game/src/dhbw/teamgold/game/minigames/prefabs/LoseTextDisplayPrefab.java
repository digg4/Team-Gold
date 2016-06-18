package dhbw.teamgold.game.minigames.prefabs;

import java.util.Random;

import org.newdawn.slick.Color;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.TextComponent;
import dhbw.teamgold.engine.components.TextRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;

public class LoseTextDisplayPrefab extends PrototypedPrefab {

	private static final String[] LOSE_TEXTS = {
			"Rekt", "Pwned", "N00b", "Git gud", "Lost", "U even trying?"
	};
	
	private static Random random = new Random();
	
	@Override
	protected void initializeGameObject(GameObject object) {
		TextComponent textComponent = new TextComponent(getRandomLoseText());
		TextRendererComponent renderer = new TextRendererComponent();
		AreaComponent areaComponent = new AreaComponent(0, 0, 1, 1);
		
		renderer.setTextColor(Color.white);
		
		object.addComponent(areaComponent);
		object.addComponent(renderer);
		object.addComponent(textComponent);
	}
	
	private String getRandomLoseText() {
		return LOSE_TEXTS[random.nextInt(LOSE_TEXTS.length)];
	}

}
