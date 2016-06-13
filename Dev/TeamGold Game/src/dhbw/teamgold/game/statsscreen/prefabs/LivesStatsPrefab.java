package dhbw.teamgold.game.statsscreen.prefabs;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent.RenderLayer;
import dhbw.teamgold.engine.components.TextComponent;
import dhbw.teamgold.engine.components.TextRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.pausemenu.components.ImageChooserLivesComponent;

public class LivesStatsPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(0.39f, 0.5f,0.2f,0.1f);
		//AreaComponent area = new AreaComponent(0.34f, 0.4f, 0.3f, 0.15f);
		ImageComponent image = new ImageComponent("res/gui/Menu-Background.png");
		ImageRendererComponent renderer = new ImageRendererComponent(RenderLayer.GUI);
		ImageChooserLivesComponent chooser = new ImageChooserLivesComponent();
		TextComponent text = new TextComponent();
		TextRendererComponent rendererText = new TextRendererComponent();
		
		object.addComponent(area);
		object.addComponent(rendererText);
		object.addComponent(text);
		object.addComponent(image);
		object.addComponent(chooser);
		object.addComponent(renderer);
	

	}

}
