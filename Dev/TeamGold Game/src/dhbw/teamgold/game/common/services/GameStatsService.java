package dhbw.teamgold.game.common.services;

import dhbw.teamgold.engine.service.Service;
import dhbw.teamgold.game.common.TransientGameStats;

/**
 * This service saves the stats of the current session. These stats will not be
 * saved after the game closes.
 * 
 * @author Daniel
 *
 */
public interface GameStatsService extends Service {

	/**
	 * @return The current stats.
	 */
	TransientGameStats getStats();

	/**
	 * Resets the stats to their start-values.
	 */
	void resetStats();

	/**
	 * @param scoreToAdd
	 *            Added to the current score.
	 */
	void addScore(int scoreToAdd);

	/**
	 * Decrements the remaining lives. Will set game-over to true of there are
	 * no loves left.
	 */
	void loseLive();

	/**
	 * @return True when the player has no loves left, false otherwise.
	 */
	boolean isGameOver();

	/**
	 * Makes the game harder.
	 */
	void increaseDifficulty();

}
