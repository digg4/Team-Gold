package dhbw.teamgold.game.common.prefabs;

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
import dhbw.teamgold.game.common.components.SwitchSceneButtonHandler;

public class SwitchSceneButtonPrefab extends PrototypedPrefab {
	
	private final int scene;
	private final String content;
	private final Rectangle bounds;

	public SwitchSceneButtonPrefab(Rectangle bounds, String content, int nextScene) {
		this.scene = nextScene;
		this.content = content;
		this.bounds = bounds;
	}

	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(bounds);
		ImageComponent image = new ImageComponent("res/gui/Button-Background.png");
		ImageRendererComponent imageRenderer = new ImageRendererComponent(RenderLayer.GUI);
		TextComponent text = new TextComponent(content);
		TextRendererComponent textRenderer = new TextRendererComponent();
		SwitchSceneButtonHandler clickHandler = new SwitchSceneButtonHandler(scene);
		
		textRenderer.setTextColor(Color.red);
		
		object.addComponent(area);
		object.addComponent(image);
		object.addComponent(imageRenderer);
		object.addComponent(text);
		object.addComponent(textRenderer);
		object.addComponent(clickHandler);
	}

}
