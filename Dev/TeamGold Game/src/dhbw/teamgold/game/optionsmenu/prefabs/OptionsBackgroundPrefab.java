package dhbw.teamgold.game.optionsmenu.prefabs;

import java.util.function.Consumer;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent.RenderLayer;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.engine.core.exception.DuplicatedComponentException;
import dhbw.teamgold.engine.core.exception.NoSuchComponentException;

public class OptionsBackgroundPrefab extends PrototypedPrefab {
	//Optionsbackground has to be choosen till then its going to be  Alternariv Gesamt
	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(0f,0f,1f,1f);
		ImageComponent image = new ImageComponent("AlternarivGesamt.png");
		ImageRendererComponent renderer = new ImageRendererComponent(RenderLayer.BACKGROUND);
		object.addComponent(area);
		object.addComponent(image);
		object.addComponent(renderer);
		
	}
}