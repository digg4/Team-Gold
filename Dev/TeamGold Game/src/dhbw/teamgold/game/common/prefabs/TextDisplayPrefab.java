package dhbw.teamgold.game.common.prefabs;

import org.newdawn.slick.Color;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.TextComponent;
import dhbw.teamgold.engine.components.TextRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.common.components.RectangeRendererComponent;

public class TextDisplayPrefab extends PrototypedPrefab {
	
	private String textToShow = "";
	
	public TextDisplayPrefab(String text) {
		this.textToShow = text;
	}
	
	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(0.35f,0.4f,0.3f,0.3f);
		TextComponent text = new TextComponent(textToShow);
		TextRendererComponent textRenderer = new TextRendererComponent();
		RectangeRendererComponent rectangleRenderer = new RectangeRendererComponent();
		
		textRenderer.setTextColor(Color.red);

		object.addComponent(area);
		object.addComponent(rectangleRenderer);
		object.addComponent(text);
		object.addComponent(textRenderer);
	}
}
