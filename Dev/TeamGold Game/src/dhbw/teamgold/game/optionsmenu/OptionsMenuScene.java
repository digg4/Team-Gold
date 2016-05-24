package dhbw.teamgold.game.optionsmenu;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;

/**
 * This Scene contains some dynamic information like time left, high-score etc.
 * Also some static information is stored here like basic game instructions.
 * Also some settings might be here.
 * 
 * @author Daniel Spaniol
 */
public class OptionsMenuScene extends Scene {

	public OptionsMenuScene() {
		super(SceneIds.OPTIONS_MENU);
	}

	@Override
	protected void initializeGameObjects() {
	}

}
