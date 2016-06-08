package dhbw.teamgold.game.common.services;

import dhbw.teamgold.engine.service.Service;
import dhbw.teamgold.game.common.PersistentGameStats;

/**
 * @author Daniel
 */
public interface GameStatsPersistenceService extends Service {

	PersistentGameStats getStats();
	
	void saveStats();
	
}
