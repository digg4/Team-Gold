package dhbw.teamgold.game;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import dhbw.teamgold.game.gameoverscreen.GameOverMenuScene;
import dhbw.teamgold.game.mainmenu.MainMenuScene;
import dhbw.teamgold.game.minigames.Minigame1Scene;
import dhbw.teamgold.game.minigames.Minigame2Scene;
import dhbw.teamgold.game.minigames.Minigame3Scene;
import dhbw.teamgold.game.minigames.Minigame4Scene;
import dhbw.teamgold.game.minigames.Minigame5Scene;
import dhbw.teamgold.game.optionsmenu.OptionsMenuScene;
import dhbw.teamgold.game.pausemenu.PauseMenuScene;
import dhbw.teamgold.game.splashscreen.SplashScreenScene;
import dhbw.teamgold.game.statsscreen.StatsScreenScene;
import dhbw.teamgold.game.timeoverscreen.TimeOverMenuScene;

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
		addScreens();
		addMenus();
		addMinigames();
		
		this.enterState(SceneIds.SPLASH_SCREEN);
	}


	private void addScreens() {
		this.addState(new SplashScreenScene());
		this.addState(new StatsScreenScene());
	}

	private void addMenus() {
		this.addState(new GameOverMenuScene());
		this.addState(new MainMenuScene());
		this.addState(new OptionsMenuScene());
		this.addState(new PauseMenuScene());
		this.addState(new TimeOverMenuScene());
	}

	private void addMinigames() {
		this.addState(new Minigame1Scene());
		this.addState(new Minigame2Scene());
		this.addState(new Minigame3Scene());
		this.addState(new Minigame4Scene());
		this.addState(new Minigame5Scene());
	}

}
