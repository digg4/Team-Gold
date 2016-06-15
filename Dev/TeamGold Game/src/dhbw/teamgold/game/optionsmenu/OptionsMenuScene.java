package dhbw.teamgold.game.optionsmenu;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.optionsmenu.prefabs.OptionsBackgroundPrefab;
import dhbw.teamgold.game.optionsmenu.prefabs.ResumeeButtonPrefab;
import dhbw.teamgold.game.optionsmenu.prefabs.SoundButtonPrefab;
import dhbw.teamgold.game.optionsmenu.prefabs.TextButtonPrefab;
import dhbw.teamgold.game.optionsmenu.prefabs.TutorialPrefab;
import dhbw.teamgold.game.common.prefabs.GameTimeDisplayPrefab;

public class OptionsMenuScene extends Scene {

	public OptionsMenuScene() {
		super(SceneIds.OPTIONS_MENU);
	}

	@Override
	protected void initializeGameObjects() {
		this.addGameObject(new SoundPlayer());
		this.addGameObject(new OptionsBackgroundPrefab());
		this.addGameObject(new SoundButtonPrefab());
		this.addGameObject(new TextButtonPrefab());
		this.addGameObject(new TutorialPrefab());
		this.addGameObject(new GameTimeDisplayPrefab());
		this.addGameObject(new ResumeeButtonPrefab());
	}

}
