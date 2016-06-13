package dhbw.teamgold.game.minigames.prefabs;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent.RenderLayer;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.components.SwitchSceneButtonHandler;

public class PauseButtonPrefab extends PrototypedPrefab{

	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(0.96f, 0.025f, 0.04f, 0.05f);
		ImageComponent image = new ImageComponent("res/gui/OptionsHell.png");
		ImageRendererComponent imageRenderer = new ImageRendererComponent(RenderLayer.GUI);
		object.addComponent(area);
		object.addComponent(image);
		object.addComponent(imageRenderer);
		object.addComponent(new SwitchSceneButtonHandler(SceneIds.PAUSE_MENU));
	}


}
