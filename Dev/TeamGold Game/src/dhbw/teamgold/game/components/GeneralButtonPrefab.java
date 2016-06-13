package dhbw.teamgold.game.components;

import org.newdawn.slick.Color;
import org.newdawn.slick.geom.Rectangle;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.TextComponent;
import dhbw.teamgold.engine.components.TextRendererComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent.RenderLayer;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.mainmenu.components.ButtonDisabledComponent;

public class GeneralButtonPrefab extends PrototypedPrefab {
	int scene;
	String content;
	Rectangle bounds;

	public GeneralButtonPrefab(Rectangle bounds, String content, int nextScene) {
		this.scene = nextScene;
		this.content = content;
		this.bounds = bounds;
	}

	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(bounds);
		ImageComponent image = new ImageComponent("ExitHell.png");
		ImageRendererComponent renderer = new ImageRendererComponent(RenderLayer.GUI);
		TextComponent text = new TextComponent(content);
		TextRendererComponent textRenderer = new TextRendererComponent();
		textRenderer.setTextColor(Color.red);
		object.addComponent(area);
		object.addComponent(image);
		object.addComponent(renderer);
		object.addComponent(text);
		object.addComponent(textRenderer);
		object.addComponent(new ButtonHandler(scene));
	}

}
