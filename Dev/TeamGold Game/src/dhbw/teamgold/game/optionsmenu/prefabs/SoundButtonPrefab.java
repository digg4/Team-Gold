package dhbw.teamgold.game.optionsmenu.prefabs;

import java.util.function.Consumer;

import org.newdawn.slick.Color;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.TextComponent;
import dhbw.teamgold.engine.components.TextRendererComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent.RenderLayer;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.engine.core.exception.DuplicatedComponentException;
import dhbw.teamgold.engine.core.exception.NoSuchComponentException;
import dhbw.teamgold.game.components.ButtonHandler;
import dhbw.teamgold.game.mainmenu.components.ButtonDisabledComponent;
import dhbw.teamgold.game.optionsmenu.components.ButtonHandlerSound;
import dhbw.teamgold.game.optionsmenu.components.ImageChooserSounds;

public class SoundButtonPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(0.6f,0.4f,0.05f,0.05f);
		ImageComponent image = new ImageComponent("ExitHell.png");
		ImageRendererComponent renderer = new ImageRendererComponent(RenderLayer.GUI);
		ImageChooserSounds chooser = new ImageChooserSounds();
		object.addComponent(area);
		object.addComponent(image);
		object.addComponent(chooser);
		object.addComponent(renderer);
		object.addComponent(new ButtonHandlerSound());
		
	}
	
}
