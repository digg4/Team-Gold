package dhbw.teamgold.game.pausemenu.prefabs;

import org.newdawn.slick.Color;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.TextComponent;
import dhbw.teamgold.engine.components.TextRendererComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent.RenderLayer;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.components.SwitchSceneButtonHandler;

public class MainMenuButtonPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(0.45f,0.52f,0.15f,0.05f);
		ImageComponent image = new ImageComponent("ExitHell.png");
		ImageRendererComponent renderer = new ImageRendererComponent(RenderLayer.GUI);
		TextComponent text = new TextComponent("Main Menu");
		TextRendererComponent textRenderer = new TextRendererComponent();
		textRenderer.setTextColor(Color.red);
		object.addComponent(area);
		object.addComponent(image);
		object.addComponent(renderer);
		object.addComponent(text);
		object.addComponent(textRenderer);
		object.addComponent(new SwitchSceneButtonHandler(SceneIds.STATS_SCREEN));			
	}



}
