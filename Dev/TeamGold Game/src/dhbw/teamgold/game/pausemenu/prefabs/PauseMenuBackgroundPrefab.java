package dhbw.teamgold.game.pausemenu.prefabs;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;

public class PauseMenuBackgroundPrefab extends PrototypedPrefab {
/*
 * 
 * MiniGameSelectorServiceProvider is needed to show the right background.
 * Till then now it uses the MainMenubackground   
 * 2 Options the normal Background of the game with an area which is nearly transparent
 * 	Or the Background picture which fades away
 */
//	MiniGameSelectorService miniGameSelectorService = Services.get(MiniGameSelectorService.class);
	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(0f,0f,1f,1f);
		ImageComponent image = new ImageComponent("AlternarivGesamt.png");
		ImageRendererComponent renderer = new ImageRendererComponent();
		object.addComponent(area);
		object.addComponent(image);
		object.addComponent(renderer);
		
		
	}



}
