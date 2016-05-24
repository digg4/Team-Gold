package dhbw.teamgold.game;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import dhbw.teamgold.game.gameovermenu.GameOverMenuScene;
import dhbw.teamgold.game.mainmenu.MainMenuScene;
import dhbw.teamgold.game.minigames.Game1Scene;
import dhbw.teamgold.game.minigames.Game2Scene;
import dhbw.teamgold.game.minigames.Game3Scene;
import dhbw.teamgold.game.minigames.Game4Scene;
import dhbw.teamgold.game.minigames.Game5Scene;
import dhbw.teamgold.game.optionsmenu.OptionsMenuScene;
import dhbw.teamgold.game.pausemenu.PauseMenuScene;
import dhbw.teamgold.game.postgamescreen.PostGameScreenScene;
import dhbw.teamgold.game.splashscreen.SplashScreenScene;
import dhbw.teamgold.game.timeovermenu.TimeOverMenuScene;

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
		addScreensWithoutInteraction();
		addMenus();
		addMiniGames();

		this.enterState(SceneIds.SPLASH_SCREEN);
	}

	private void addMiniGames() {
		this.addState(new Game1Scene());
		this.addState(new Game2Scene());
		this.addState(new Game3Scene());
		this.addState(new Game4Scene());
		this.addState(new Game5Scene());
	}

	private void addMenus() {
		this.addState(new TimeOverMenuScene());
		this.addState(new PauseMenuScene());
		this.addState(new OptionsMenuScene());
		this.addState(new GameOverMenuScene());
		this.addState(new MainMenuScene());
	}

	private void addScreensWithoutInteraction() {
		this.addState(new SplashScreenScene());
		this.addState(new PostGameScreenScene());
	}

}
