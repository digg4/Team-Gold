package dhbw.teamgold.game.common.services;

import dhbw.teamgold.engine.service.Service;

public interface WinLoseTextService extends Service {

	String getCurrentText();
	
	void loadNextWinText();
	
	void loadNextLoseText();
	
}
