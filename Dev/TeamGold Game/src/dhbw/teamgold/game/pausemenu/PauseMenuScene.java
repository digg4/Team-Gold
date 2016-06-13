package dhbw.teamgold.game.pausemenu;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.components.GeneralButtonPrefab;
import dhbw.teamgold.game.pausemenu.prefabs.LivesPrefab;
import dhbw.teamgold.game.pausemenu.prefabs.PauseMenuBackgroundPrefab;
import dhbw.teamgold.game.pausemenu.prefabs.ResumeButtonPrefab;
import dhbw.teamgold.game.prefabs.ScorePrefab;
import dhbw.teamgold.game.prefabs.showTimerPrefab;

public class PauseMenuScene extends Scene {

	public PauseMenuScene() {
		super(SceneIds.PAUSE_MENU);
	}

	@Override
	protected void initializeGameObjects() {
		this.addGameObject(new PauseMenuBackgroundPrefab());
		this.addGameObject(new showTimerPrefab());
		this.addGameObject(new LivesPrefab());
		this.addGameObject(new ScorePrefab());
		
		this.addGameObject(new ResumeButtonPrefab());
		this.addGameObject(new GeneralButtonPrefab(new Rectangle(0.45f,0.46f,0.15f,0.05f), "Options", SceneIds.STATS_SCREEN));
		this.addGameObject(new GeneralButtonPrefab(new Rectangle(0.45f,0.52f,0.15f,0.05f), "Main Menu", SceneIds.MAIN_MENU));
	}

}
