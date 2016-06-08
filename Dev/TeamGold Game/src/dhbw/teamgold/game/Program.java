package dhbw.teamgold.game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.providers.GameStatsPersistenceServiceProvider;

/**
 * A class to contain the main-method.
 * 
 * @author Daniel Spaniol
 */
public final class Program {

	private static final String NAME = "???";
	private static final int WIDTH = 1280;
	private static final int HEIGHT = 720;
	private static final boolean FULLSCREEN = false;
	private static final boolean SHOW_FPS = false;
	private static final int TARGET_FPS = 60;

	public static void main(String[] args) {
		Services.registerDefaultProviders();
		registerCustomProviders();

		try {
			AppGameContainer game = new AppGameContainer(new _TeamGold_Game(NAME));
			game.setDisplayMode(WIDTH, HEIGHT, FULLSCREEN);
			game.setShowFPS(SHOW_FPS);
			game.setTargetFrameRate(TARGET_FPS);
			game.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

	private static void registerCustomProviders() {
		Services.provide(new GameStatsPersistenceServiceProvider());
	}

	/**
	 * Private so we don't instantiate this class.
	 */
	private Program() {
	}

}
