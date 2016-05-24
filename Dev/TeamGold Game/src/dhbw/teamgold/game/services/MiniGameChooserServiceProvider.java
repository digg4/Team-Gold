package dhbw.teamgold.game.services;

import dhbw.teamgold.engine.service.Provider;

/**
 * A provider that creates a new MinigameChooserService.
 * 
 * @author Daniel Spaniol
 */
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
