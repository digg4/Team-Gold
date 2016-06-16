package dhbw.teamgold.game.common.services;

import dhbw.teamgold.engine.service.Service;

/**
 * Service to keep track of which minigames will be played.
 * 
 * @author Daniel Spaniol
 */
public interface MiniGameSelectorService extends Service {

	/**
	 * Calculates which minigame should be played next. This will not return the
	 * same minigame twice in a row and will make sure every minigame will be
	 * played.
	 * 
	 * @return The ID of the next minigame.
	 */
	int getNextMiniGameId();

	/**
	 * @return The ID of the current minigame.
	 */
	int getCurrentMiniGameId();
	
	/**
	 * @return The ID of the win-scene for the current minigame.
	 */
	int getCurrentWinSceneId();
	
	/**
	 * @return The ID of the lose-scene for the current minigame.
	 */
	int getCurrentLoseSceneId();

}
