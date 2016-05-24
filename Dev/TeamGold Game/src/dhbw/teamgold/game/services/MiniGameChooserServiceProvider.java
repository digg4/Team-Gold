package dhbw.teamgold.game.services;

import dhbw.teamgold.engine.service.Provider;

public class MiniGameChooserServiceProvider implements Provider<MinigameChooserService> {

	@Override
	public MinigameChooserService createService() {
		return new MinigameChooserServiceImpl();
	}

	@Override
	public Class<MinigameChooserService> getType() {
		return MinigameChooserService.class;
	}

}
