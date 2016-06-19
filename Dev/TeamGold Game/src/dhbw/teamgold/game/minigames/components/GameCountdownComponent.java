package dhbw.teamgold.game.minigames.components;

import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.services.GameStatsService;
import dhbw.teamgold.game.common.services.WinLoseService;

public class GameCountdownComponent extends Component {
	
	private static final float MIN_SECONDS = 1.5f;

	private GameStatsService gameStatsService = Services.get(GameStatsService.class);
	private WinLoseService winLoseService = Services.get(WinLoseService.class);
	
	private float initialTime;
	private float secondsLeft;

	public void init(float initialTime, float secondsPerDifficulty) {
		initialTime -= secondsPerDifficulty * gameStatsService.getStats().getDifficulty();
		initialTime = Math.max(MIN_SECONDS, initialTime);
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
			winLoseService.lose();
			getGameObject().getScene().switchScene(SceneIds.STATS_SCREEN);
		}
	}
}
