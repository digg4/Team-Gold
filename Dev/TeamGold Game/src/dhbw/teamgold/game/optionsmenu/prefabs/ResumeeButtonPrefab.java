package dhbw.teamgold.game.optionsmenu.prefabs;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent.RenderLayer;
import dhbw.teamgold.engine.components.TextComponent;
import dhbw.teamgold.engine.components.TextRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.optionsmenu.components.ResumeeButtonHandler;

public class ResumeeButtonPrefab extends PrototypedPrefab {
	
	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(0.426f, 0.85f, 0.15f, 0.05f);
		ImageComponent image = new ImageComponent("res/gui/Button-Background.png");
		ImageRendererComponent renderer = new ImageRendererComponent(RenderLayer.GUI);
		TextComponent text = new TextComponent("Resume");
		TextRendererComponent rendererText = new TextRendererComponent();
		object.addComponent(area);
		object.addComponent(image);
		object.addComponent(renderer);
		object.addComponent(text);
		object.addComponent(rendererText);
		object.addComponent(new ResumeeButtonHandler());
	}

}
