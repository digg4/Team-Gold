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

	int WIN_1 = 31;
	int WIN_2 = 32;
	int WIN_3 = 33;
	int WIN_4 = 34;
	int WIN_5 = 35;

	int LOSE_1 = 41;
	int LOSE_2 = 42;
	int LOSE_3 = 43;
	int LOSE_4 = 44;
	int LOSE_5 = 45;
	
	int GENERIC_WIN = 51;
	int GENERIC_LOSE = 52;

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
	/**
	 * The IDs of the win-scenes.
	 */
	int[] WINS = { WIN_1, WIN_2, WIN_3, WIN_4, WIN_5 };
	/**
	 * The IDs of the lose-scenes.
	 */
	int[] LOSES = { LOSE_1, LOSE_2, LOSE_3, LOSE_4, LOSE_4, };
}
