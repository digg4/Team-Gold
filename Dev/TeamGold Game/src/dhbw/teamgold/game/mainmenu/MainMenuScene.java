package dhbw.teamgold.game.mainmenu;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
<<<<<<< HEAD
import dhbw.teamgold.game.components.GeneralButtonPrefab;
import dhbw.teamgold.game.mainmenu.prefabs.ButtonBackGroundPrefab;
import dhbw.teamgold.game.mainmenu.prefabs.EnterSceneGamePrefab;
import dhbw.teamgold.game.mainmenu.prefabs.ExitGamePrefab;
import dhbw.teamgold.game.mainmenu.prefabs.HighscorePrefab;
import dhbw.teamgold.game.mainmenu.prefabs.MainMenuBackgroundPrefab;
import dhbw.teamgold.game.prefabs.showTimerPrefab;
=======
import dhbw.teamgold.game.mainmenu.prefabs.StartGameButtonPrefab;
import dhbw.teamgold.game.mainmenu.prefabs.ExitGameButtonPrefab;
import dhbw.teamgold.game.mainmenu.prefabs.HighscorePrefab;
import dhbw.teamgold.game.mainmenu.prefabs.MainMenuBackgroundPrefab;
import dhbw.teamgold.game.mainmenu.prefabs.OptionsButtonPrefab;
import dhbw.teamgold.game.mainmenu.prefabs.ShowGameTimePrefab;
>>>>>>> fca4a29377c0c46b3fcafcb96a62a9e8cec78da1

public class MainMenuScene extends Scene {

	public MainMenuScene() {
		super(SceneIds.MAIN_MENU);
	}

	@Override
	protected void initializeGameObjects() {
<<<<<<< HEAD
		
		this.addGameObject(new MainMenuBackgroundPrefab());
		this.addGameObject(new ButtonBackGroundPrefab());
		this.addGameObject(new showTimerPrefab());
		this.addGameObject(new HighscorePrefab());
		
		this.addGameObject(new EnterSceneGamePrefab());
		this.addGameObject(new GeneralButtonPrefab(new Rectangle(0.01f, 0.85f, 0.15f, 0.05f), "Options", SceneIds.OPTIONS_MENU));
		this.addGameObject(new ExitGamePrefab());		
=======
		this.addGameObject(new MainMenuBackgroundPrefab());
		this.addGameObject(new ShowGameTimePrefab());
		this.addGameObject(new HighscorePrefab());
		this.addGameObject(new OptionsButtonPrefab());
		this.addGameObject(new StartGameButtonPrefab());
		this.addGameObject(new ExitGameButtonPrefab());		
>>>>>>> fca4a29377c0c46b3fcafcb96a62a9e8cec78da1
	}
}