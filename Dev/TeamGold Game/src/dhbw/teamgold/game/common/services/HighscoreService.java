package dhbw.teamgold.game.common.services;

import dhbw.teamgold.engine.service.Service;

/**
 * A Service to give access to the highscore of the PersistantGameStats.
 * 
 * @author Daniel Spaniol
 */
public interface HighscoreService extends Service {

	/**
	 * @return The current highscore.
	 */
	int getHighscore();

	/**
	 * @param highscore
	 *            The new highscroe.
	 */
	void setHighscore(int highscore);

	/**
	 * @param score
	 *            The score to be tested.
	 * @return True if score is higher than the current highscore, false
	 *         otherwise.
	 */
	boolean isNewHighscore(int score);

}
