package dhbw.teamgold.game.mainmenu;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.mainmenu.prefabs.MainMenuBackgroundPrefab;

public class MainMenuScene extends Scene {

	public MainMenuScene() {
		super(SceneIds.MAIN_MENU);
	}

	@Override
	protected void initializeGameObjects() {
		this.addGameObject(new MainMenuBackgroundPrefab());
	}

}
