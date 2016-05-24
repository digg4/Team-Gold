package dhbw.teamgold.game.timeovermenu;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;

/**
 * A Scene that is shown when you ended a mini-game and have no time left to
 * play another one. This gives you the option to enter the MainMenu again.
 * 
 * @author Daniel
 */
public class TimeOverMenuScene extends Scene {

	public TimeOverMenuScene() {
		super(SceneIds.TIME_OVER_MENU);
	}

	@Override
	protected void initializeGameObjects() {
	}

}
