package dhbw.teamgold.game.timeoverscreen;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.components.GeneralButtonPrefab;
import dhbw.teamgold.game.common.prefabs.TextPlacePrefab;

public class TimeOverMenuScene extends Scene {

	public TimeOverMenuScene() {
		super(SceneIds.TIME_OVER_MENU);
	}

	@Override
	protected void initializeGameObjects() {
		this.addGameObject(new TextPlacePrefab("The Play Time is Over"));
		this.addGameObject(new GeneralButtonPrefab(new Rectangle(0.426f, 0.75f, 0.15f, 0.05f),"Back to Main Menu", SceneIds.MAIN_MENU));
	}

}
