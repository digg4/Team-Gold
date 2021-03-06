package dhbw.teamgold.game.mainmenu;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.prefabs.GameTimeDisplayPrefab;
import dhbw.teamgold.game.common.prefabs.SwitchSceneButtonPrefab;
import dhbw.teamgold.game.mainmenu.prefabs.ButtonBackGroundPrefab;
import dhbw.teamgold.game.mainmenu.prefabs.EnterSceneGamePrefab;
import dhbw.teamgold.game.mainmenu.prefabs.ExitGamePrefab;
import dhbw.teamgold.game.mainmenu.prefabs.HighscorePrefab;
import dhbw.teamgold.game.mainmenu.prefabs.MainMenuBackgroundPrefab;
import dhbw.teamgold.game.mainmenu.prefabs.PlanePrefab;

public class MainMenuScene extends Scene {

	public MainMenuScene() {
		super(SceneIds.MAIN_MENU);
	}

	@Override
	protected void initializeGameObjects() {
		
		this.addGameObject(new MainMenuBackgroundPrefab());
		this.addGameObject(new PlanePrefab());
		this.addGameObject(new ButtonBackGroundPrefab());
		this.addGameObject(new GameTimeDisplayPrefab());
		this.addGameObject(new HighscorePrefab());

		this.addGameObject(new EnterSceneGamePrefab());
		this.addGameObject(new SwitchSceneButtonPrefab(new Rectangle(0.01f, 0.85f, 0.15f, 0.05f), "Options",
				SceneIds.OPTIONS_MENU));
		this.addGameObject(new ExitGamePrefab());
	}
}