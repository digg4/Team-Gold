package dhbw.teamgold.game.timeoverscreen;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.Messages;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.prefabs.SwitchSceneButtonPrefab;

public class TimeOverMenuScene extends Scene {

	public TimeOverMenuScene() {
		super(SceneIds.TIME_OVER_MENU);
	}

	@Override
	protected void initializeGameObjects() {
		this.addGameObject(new TimeOverMenuSceneBackgroundPrefab());
		this.addGameObject(new SwitchSceneButtonPrefab(new Rectangle(0.4f, 0.75f, 0.15f, 0.05f),
				Messages.getString("TimeOverMenu.Back"), SceneIds.MAIN_MENU));
	}

}
