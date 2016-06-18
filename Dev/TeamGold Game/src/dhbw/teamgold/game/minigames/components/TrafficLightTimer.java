package dhbw.teamgold.game.minigames.components;

import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.GameStatsService;

public class TrafficLightTimer extends Component {

	private static final float RED_SECONDS_PER_DIFFICULTY = 0.025f;
	private static final float GREEN_SECONDS_PER_DIFFICULTY = 0.0275f;
	private static final float MIN_RED_SECONDS = 0.5f;
	private static final float MIN_GREEN_SECONDS = 0.1f;
	
	private GameStatsService gameStatsService = Services.get(GameStatsService.class);
	
	private float redSeconds;
	private float greenSeconds;
	private float redSecondsLeft;
	private float greenSecondsLeft;

	private Phase phase = Phase.RED;

	public TrafficLightTimer(float greenSeconds, float redSeconds) {
		int difficulty = gameStatsService.getStats().getDifficulty();
		
		this.greenSeconds = Math.max(MIN_GREEN_SECONDS, greenSeconds - difficulty * GREEN_SECONDS_PER_DIFFICULTY);
		this.redSeconds = Math.max(MIN_RED_SECONDS, redSeconds - difficulty * RED_SECONDS_PER_DIFFICULTY);
		this.greenSecondsLeft = this.greenSeconds;
		this.redSecondsLeft = this.redSeconds;
	}
	
	public Phase getPhase() {
		return phase;
	}

	@Override
	public void onUpdate(UpdateArguments arguments) {
		double time = arguments.getSecondsSinceLastUpdate();

		if (phase == Phase.RED) {
			if (redSecondsLeft > 0) {
				redSecondsLeft -= time;
			}

			if (redSecondsLeft <= 0) {
				redSecondsLeft = redSeconds;
				phase = Phase.GREEN;
			}
		} else {
			if (greenSecondsLeft > 0) {
				greenSecondsLeft -= time;
			}
			
			if (greenSecondsLeft <= 0) {
				greenSecondsLeft = greenSeconds;
				phase = Phase.RED;
			}
		}
	}

	public static enum Phase {
		RED, GREEN
	}

}
