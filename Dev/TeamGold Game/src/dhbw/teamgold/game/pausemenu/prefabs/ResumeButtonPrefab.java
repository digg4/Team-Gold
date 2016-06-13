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

public class ResumeButtonPrefab extends PrototypedPrefab {
	/*
	 * For this to work properly MiniGameSelectorServiceProvider has to be implemented. 
	 * Till then it only goes to the Mainmenu
	 */
//	MiniGameSelectorService miniGameSelectorService = Services.get(MiniGameSelectorService.class);
	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(0.45f,0.4f,0.15f,0.05f);
		ImageComponent image = new ImageComponent("ExitHell.png");
		ImageRendererComponent renderer = new ImageRendererComponent(RenderLayer.GUI);
		TextComponent text = new TextComponent("Resume");
		TextRendererComponent textRenderer = new TextRendererComponent();
		textRenderer.setTextColor(Color.red);
		object.addComponent(area);
		object.addComponent(image);
		object.addComponent(renderer);
		object.addComponent(text);
		object.addComponent(textRenderer);
		//object.addComponent(new ButtonHandler(miniGameSelectorService.getCurrentMiniGameId()));		
		object.addComponent(new SwitchSceneButtonHandler(SceneIds.MAIN_MENU));
	}



}
