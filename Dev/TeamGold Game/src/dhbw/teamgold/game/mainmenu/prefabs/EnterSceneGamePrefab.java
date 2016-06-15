package dhbw.teamgold.game.mainmenu.prefabs;

import org.newdawn.slick.Color;
import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent.RenderLayer;
import dhbw.teamgold.engine.components.TextComponent;
import dhbw.teamgold.engine.components.TextRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.mainmenu.components.ButtonDisabledComponent;
import dhbw.teamgold.game.mainmenu.components.StartGameButtonClickHandler;

public class EnterSceneGamePrefab extends PrototypedPrefab {
	static Rectangle bounds =	new Rectangle( 0.01f, 0.79f, 0.15f, 0.05f);
	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(bounds);
		ButtonDisabledComponent  buttonDisabler = new ButtonDisabledComponent();
		ImageComponent image = new ImageComponent("res/gui/Button-Background.png");
		ImageRendererComponent renderer = new ImageRendererComponent(RenderLayer.GUI);
		TextComponent text = new TextComponent("Play");
		TextRendererComponent textRenderer = new TextRendererComponent();
		textRenderer.setTextColor(Color.red);
		object.addComponent(area);
		object.addComponent(image);
		object.addComponent(renderer);
		object.addComponent(text);
		object.addComponent(textRenderer);
		object.addComponent(buttonDisabler);
		object.addComponent(new StartGameButtonClickHandler());
	}


}
