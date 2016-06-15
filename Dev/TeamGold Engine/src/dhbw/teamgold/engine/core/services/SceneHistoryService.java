package dhbw.teamgold.engine.core.services;

import dhbw.teamgold.engine.service.Service;

public interface SceneHistoryService extends Service {

	int popLastSceneId();
	
	void pushSceneId(int id);
	
}
