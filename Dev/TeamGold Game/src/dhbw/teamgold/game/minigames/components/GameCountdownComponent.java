package dhbw.teamgold.game.minigames.components;

import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.GameStatsService;
import dhbw.teamgold.game.common.services.MiniGameSelectorService;

public class GameCountdownComponent extends Component {

	private GameStatsService gameStatsService = Services.get(GameStatsService.class);
	private MiniGameSelectorService selectorService = Services.get(MiniGameSelectorService.class);

	private float initialTime;
	private float secondsLeft;

	public void init(float initialTime, float secondsPerDifficulty) {
		initialTime -= secondsPerDifficulty * gameStatsService.getStats().getDifficulty();
		this.initialTime = initialTime;
		this.secondsLeft = initialTime;
	}
	
	public float getPercentDone() {
		return 1 - (secondsLeft / initialTime);
	}

	@Override
	public void onUpdate(UpdateArguments arguments) {
		if (secondsLeft > 0) {
			secondsLeft -= arguments.getSecondsSinceLastUpdate();
		}

		if (secondsLeft <= 0) {
			getGameObject().getScene().switchScene(selectorService.getCurrentLoseSceneId());
		}
	}
}
