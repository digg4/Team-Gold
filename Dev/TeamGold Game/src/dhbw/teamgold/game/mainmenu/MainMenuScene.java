package dhbw.teamgold.game.mainmenu;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.mainmenu.prefabs.StartGameButtonPrefab;
import dhbw.teamgold.game.mainmenu.prefabs.ExitGameButtonPrefab;
import dhbw.teamgold.game.mainmenu.prefabs.HighscorePrefab;
import dhbw.teamgold.game.mainmenu.prefabs.MainMenuBackgroundPrefab;
import dhbw.teamgold.game.mainmenu.prefabs.OptionsButtonPrefab;
import dhbw.teamgold.game.mainmenu.prefabs.ShowTimerPrefab;

public class MainMenuScene extends Scene {

	public MainMenuScene() {
		super(SceneIds.MAIN_MENU);
	}

	@Override
	protected void initializeGameObjects() {
		this.addGameObject(new MainMenuBackgroundPrefab());
		this.addGameObject(new ShowTimerPrefab());
		this.addGameObject(new HighscorePrefab());
		this.addGameObject(new OptionsButtonPrefab());
		this.addGameObject(new StartGameButtonPrefab());
		this.addGameObject(new ExitGameButtonPrefab());		
	}
}