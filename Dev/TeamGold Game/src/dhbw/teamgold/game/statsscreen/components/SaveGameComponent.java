package dhbw.teamgold.game.statsscreen.components;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.GameStatsPersistenceService;

public class SaveGameComponent extends Component {

	private GameStatsPersistenceService persistenceService = Services.get(GameStatsPersistenceService.class);
	
	@Override
	public void onInitializeGameObject(InitializeArguments arguments) {
		persistenceService.saveStats();
	}

}
