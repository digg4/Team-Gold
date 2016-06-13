package dhbw.teamgold.game.common.prefabs;

import org.newdawn.slick.Color;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.TextComponent;
import dhbw.teamgold.engine.components.TextRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.optionsmenu.components.DrawRectangle;

public class TextPlacePrefab extends PrototypedPrefab {
	String textToShow = "";
	public TextPlacePrefab(String text) {
		this.textToShow = text;
	}
	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(0.35f,0.4f,0.3f,0.3f);
		TextComponent text = new TextComponent(textToShow);
		TextRendererComponent renderer = new TextRendererComponent();
		renderer.setTextColor(Color.red);
		DrawRectangle drawer = new DrawRectangle();
		
		object.addComponent(area);
		object.addComponent(drawer);
		object.addComponent(text);
		
		object.addComponent(renderer);
	}
}
