package dhbw.teamgold.game;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import dhbw.teamgold.game.gameoverscreen.GameOverMenuScene;
import dhbw.teamgold.game.mainmenu.MainMenuScene;
import dhbw.teamgold.game.splashscreen.SplashScreenScene;

/**
 * The Game itself as provided by the Slick2D-engine. It is just a state-machine
 * that delegates the updating and rendering etc to its current state.
 * 
 * @author Daniel Spaniol
 */
public class _TeamGold_Game extends StateBasedGame {

	public _TeamGold_Game(String name) {
		super(name);
	}

	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		this.addState(new SplashScreenScene());
		this.addState(new MainMenuScene());
		this.addState(new GameOverMenuScene());
		
		this.enterState(SceneIds.GAME_OVER_MENU);
	}

}
