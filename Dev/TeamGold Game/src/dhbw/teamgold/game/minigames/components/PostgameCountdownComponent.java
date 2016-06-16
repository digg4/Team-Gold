package dhbw.teamgold.game.minigames.components;

import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.services.MiniGameSelectorService;

public class PostgameCountdownComponent extends Component {

	private float secondsLeft;
	
	public PostgameCountdownComponent(float initialSeconds) {
		secondsLeft = initialSeconds;
	}
	
	@Override
	public void onUpdate(UpdateArguments arguments) {
		if (secondsLeft >= 0) {
			secondsLeft -= arguments.getSecondsSinceLastUpdate();
		} else {
			getGameObject().getScene().switchScene(SceneIds.STATS_SCREEN);
		}
	}
	
}
