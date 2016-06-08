package dhbw.teamgold.game.common.services;

import dhbw.teamgold.engine.service.Service;
import dhbw.teamgold.game.common.TransientGameStats;

public interface GameStatsService extends Service {

	TransientGameStats getStats();
	
	void resetStats();
	
	void addScore(int scoreToAdd);
	
	void loseLive();
	
	boolean isGameOver();
	
	void increaseDifficulty();
	
}
