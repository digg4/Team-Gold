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
import dhbw.teamgold.game.mainmenu.components.ExitButtonClickHandler;

public class ExitGameButtonPrefab extends PrototypedPrefab {
	
	private static final Rectangle BOUNDS = new Rectangle(0.01f, 0.91f, 0.15f, 0.05f);

	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(BOUNDS);
		TextComponent text = new TextComponent("Exit");
		TextRendererComponent textRenderer = new TextRendererComponent();
		ImageComponent image = new ImageComponent("ExitHell.png");
		ImageRendererComponent renderer = new ImageRendererComponent(RenderLayer.GUI);
		ExitButtonClickHandler clickHandlerComponent = new ExitButtonClickHandler();

		textRenderer.setTextColor(Color.red);
		
		object.addComponent(area);
		object.addComponent(image);
		object.addComponent(renderer);
		object.addComponent(text);
		object.addComponent(textRenderer);
		object.addComponent(clickHandlerComponent);
	}
}
