package dhbw.teamgold.game.minigames.components;

import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.GameStatsService;

public class FoodCoverAnimator extends Component {

	private static final float DEFAULT_SECONDS = 3;
	private static final float SECONDS_PER_DIFFICULTY = 0.15f;
	private static final float MIN_SECONDS = 0.3f;

	private GameStatsService statsService = Services.get(GameStatsService.class);

	@Require
	private AreaComponent areaComponent;
	
	private boolean isFinished;
	private float initialSeconds = Math.max(MIN_SECONDS,
			DEFAULT_SECONDS - SECONDS_PER_DIFFICULTY * statsService.getStats().getDifficulty());
	private float secondsLeft = initialSeconds;
	private float initialHeight = -1;
	
	
	@Override
	public void onUpdate(UpdateArguments arguments) {
		if (secondsLeft > 0) {
			secondsLeft -= arguments.getSecondsSinceLastUpdate();
		}
		
		if (initialHeight == -1) {
			initialHeight = areaComponent.getAbsoluteArea().getY();
		}
		
		float additionalHeight = (float) -(Math.sin(getPercentDone() * Math.PI) * 200);
		areaComponent.getAbsoluteArea().setY(initialHeight + additionalHeight);

		if (secondsLeft <= 0 && !isFinished) {
			secondsLeft = 0;
			isFinished = true;
		}
	}
	
	private float getPercentDone() {
		return 1 - (secondsLeft / initialSeconds);
	}

	public boolean isFinished() {
		return isFinished;
	}

	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}

}
