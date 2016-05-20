package dhbw.teamgold.engine.behavior.services;

import dhbw.teamgold.engine.service.Provider;

/**
 * Creates a new BehaviorArgumentService.
 * 
 * @author Daniel Spaniol
 */
public class BehaviorArgumentServiceProvider implements Provider<BehaviorArgumentService> {

	@Override
	public BehaviorArgumentService createService() {
		return new BehaviorArgumentServiceImpl();
	}

	@Override
	public Class<BehaviorArgumentService> getType() {
		return BehaviorArgumentService.class;
	}

}
