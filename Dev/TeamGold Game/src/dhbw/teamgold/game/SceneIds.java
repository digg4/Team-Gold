package dhbw.teamgold.game;

/**
 * An interface to hold all the Scene-ID constants.
 * 
 * @author Daniel Spaniol
 */
public interface SceneIds {
	int SPLASH_SCREEN = 0;
	int POST_GAME_SCREEN = 1;
	int STATS_SCREEN = 2;

	int MAIN_MENU = 11;
	int OPTIONS_MENU = 12;
	int PAUSE_MENU = 13;
	int GAME_OVER_MENU = 14;
	int TIME_OVER_MENU = 15;

	int GAME_1 = 21;
	int GAME_2 = 22;
	int GAME_3 = 23;
	int GAME_4 = 24;
	int GAME_5 = 25;

	/**
	 * All the IDs of Scenes that should only show something to to user but
	 * don't need any action of the user to be performed.
	 */
	int[] SCREENS_WITHOUT_INTERACTION = { SPLASH_SCREEN, POST_GAME_SCREEN, STATS_SCREEN };
	/**
	 * All the IDs of Scenes that contain mainly GUI elements and need the user
	 * to perform actions.
	 */
	int[] MENUS = { MAIN_MENU, OPTIONS_MENU, PAUSE_MENU, GAME_OVER_MENU, TIME_OVER_MENU };
	/**
	 * All the IDs of mini-games.
	 */
	int[] GAMES = { GAME_1, GAME_2, GAME_3, GAME_4, GAME_5 };
}
