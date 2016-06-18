package dhbw.teamgold.game.minigames.components;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class UpCarBoundsCollider extends Component {

	@Require
	private UpCarImageChooserComponent imageChooser;
	
	@Require
	private AreaComponent areaComponent;
	
	private int sceneWidth;
	private int sceneHeight;
	
	@Override
	public void onInitializeGameObject(InitializeArguments arguments) {
		sceneWidth = getGameObject().getScene().getSceneWidth();
		sceneHeight = getGameObject().getScene().getSceneHeight();
	}

	@Override
	public void onUpdate(UpdateArguments arguments) {
		if (areaComponent.getAbsoluteArea().getMinX() > sceneWidth) {
			areaComponent.getAbsoluteArea().setLocation(-0.3f * sceneWidth, 0.8f * sceneHeight);
			imageChooser.chooseRandomImage();
		}
	}
	
}
