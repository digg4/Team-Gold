package dhbw.teamgold.engine.core.services;

import dhbw.teamgold.engine.service.Provider;

public class AssetsServiceProvider implements Provider<AssetsService> {

	@Override
	public AssetsService createService() {
		return new AssetsServiceImpl();
	}

	@Override
	public Class<AssetsService> getType() {
		return AssetsService.class;
	}

}
