package dhbw.teamgold.game.services;

import dhbw.teamgold.engine.service.Service;

/**
 * This service has the purpose to choose which mini-game will be played next.
 * 
 * @author Daniel Spaniol
 */
public interface MinigameChooserService extends Service {

	/**
	 * Get the ID of the next mini-game to play. No ID should be chosen twice in
	 * a row.
	 * 
	 * @return The ID of the next mini-game.
	 */
	int getNextMinigameId();

	/**
	 * @return The ID of the current mini-game.
	 */
	int getCurrentMinigameId();

}
