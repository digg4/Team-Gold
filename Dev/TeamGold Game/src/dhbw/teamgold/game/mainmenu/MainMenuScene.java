package dhbw.teamgold.game.mainmenu;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.mainmenu.prefab.EnterSceneGamePrefab;
import dhbw.teamgold.game.mainmenu.prefab.ExitGamePrefab;
import dhbw.teamgold.game.mainmenu.prefab.HighscorePrefab;
import dhbw.teamgold.game.mainmenu.prefab.MainMenuBackgroundPrefab;
import dhbw.teamgold.game.mainmenu.prefab.showTimerPrefab;
import dhbw.teamgold.game.prefab.EnterScene12ButtonPrefab;

public class MainMenuScene extends Scene {

	public MainMenuScene() {
		super(SceneIds.MAIN_MENU);
	}

	@Override
	protected void initializeGameObjects() {
		
		
		this.addGameObject(new MainMenuBackgroundPrefab());
		this.addGameObject(new showTimerPrefab());
		this.addGameObject(new HighscorePrefab());
		this.addGameObject(new EnterScene12ButtonPrefab());
		this.addGameObject(new EnterSceneGamePrefab());
		this.addGameObject(new ExitGamePrefab());		
	}
}