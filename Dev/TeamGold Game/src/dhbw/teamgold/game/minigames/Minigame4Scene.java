package dhbw.teamgold.game.minigames;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent.RenderLayer;
import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.Game4BackgroundPrefab;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.prefabs.GameTimeDisplayPrefab;
import dhbw.teamgold.game.common.prefabs.ScoreDisplayPrefab;
import dhbw.teamgold.game.minigames.prefabs.Game3BackgroundPrefab;
import dhbw.teamgold.game.minigames.prefabs.PauseButtonPrefab;
import dhbw.teamgold.game.pausemenu.prefabs.LivesPrefab;

public class Minigame4Scene extends Scene {

	public Minigame4Scene() {
		super(SceneIds.GAME_4);
	}

	@Override
	protected void initializeGameObjects() {

		this.addGameObject(new PauseButtonPrefab());
		this.addGameObject(new GameTimeDisplayPrefab());
		this.addGameObject(new ScoreDisplayPrefab());
		this.addGameObject(new LivesPrefab());
		this.addGameObject(new Game4BackgroundPrefab());
		
	}

}
