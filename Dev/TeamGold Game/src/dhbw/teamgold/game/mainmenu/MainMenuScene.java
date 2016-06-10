package dhbw.teamgold.game.mainmenu;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.mainmenu.prefabs.EnterSceneGamePrefab;
import dhbw.teamgold.game.mainmenu.prefabs.ExitGamePrefab;
import dhbw.teamgold.game.mainmenu.prefabs.HighscorePrefab;
import dhbw.teamgold.game.mainmenu.prefabs.MainMenuBackgroundPrefab;
import dhbw.teamgold.game.mainmenu.prefabs.ShowTimerPrefab;
import dhbw.teamgold.game.prefab.EnterScene12ButtonPrefab;

public class MainMenuScene extends Scene {

	public MainMenuScene() {
		super(SceneIds.MAIN_MENU);
	}

	@Override
	protected void initializeGameObjects() {
		
		
		this.addGameObject(new MainMenuBackgroundPrefab());
		this.addGameObject(new ShowTimerPrefab());
		this.addGameObject(new HighscorePrefab());
		this.addGameObject(new EnterScene12ButtonPrefab());
		this.addGameObject(new EnterSceneGamePrefab());
		this.addGameObject(new ExitGamePrefab());		
	}
}