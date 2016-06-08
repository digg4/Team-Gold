package dhbw.teamgold.game.common.services;

import dhbw.teamgold.engine.service.Service;
import dhbw.teamgold.game.common.PersistentGameStats;

/**
 * This Service has the purpose to load and save the GameStats. This should
 * mainly be a helper-Service for other services.
 * 
 * @author Daniel Spaniol
 */
public interface GameStatsPersistenceService extends Service {

	/**
	 * Loads the stats from the savegame-file if there is one, otherwise new
	 * stats are created.
	 * 
	 * @return The stats.
	 */
	PersistentGameStats getStats();

	/**
	 * Saves the stats in the savegame-file.
	 */
	void saveStats();

}
