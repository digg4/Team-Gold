package dhbw.teamgold.game.common.services;

import dhbw.teamgold.engine.service.Service;

public interface MiniGameSelectorService extends Service {

	int getNextMiniGameId();
	
	int getCurrentMiniGameId();
	
}
