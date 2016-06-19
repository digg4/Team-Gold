package dhbw.teamgold.game.minigames.components;

import java.util.stream.Stream;

import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.services.WinLoseService;

public class CablesWinCheckerComponent extends Component {

	private GameObject[] cables;
	private WinLoseService winLoseService = Services.get(WinLoseService.class);

	public CablesWinCheckerComponent(GameObject... cables) {
		this.cables = cables;
	}

	@Override
	public void onUpdate(UpdateArguments arguments) {
		if (allAreFinished()) {
			winLoseService.win();
			getGameObject().getScene().switchScene(SceneIds.STATS_SCREEN);
		}
	}

	private boolean allAreFinished() {
		return Stream.of(cables).allMatch(c -> c.getComponent(CableDataComponent.class).isFinished());
	}

}
