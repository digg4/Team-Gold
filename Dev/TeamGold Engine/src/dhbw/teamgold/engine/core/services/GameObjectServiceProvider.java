package dhbw.teamgold.engine.core.services;

import dhbw.teamgold.engine.service.Provider;

public class GameObjectServiceProvider implements Provider<GameObjectService> {

	@Override
	public GameObjectService createService() {
		return new GameObjectServiceImpl();
	}

	@Override
	public Class<GameObjectService> getType() {
		return GameObjectService.class;
	}

}
