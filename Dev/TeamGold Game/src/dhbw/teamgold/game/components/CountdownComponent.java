package dhbw.teamgold.game.components;

import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.core.Component;

public class CountdownComponent extends Component {
	
	private static final double DEFAULT_INITIAL_DURATION = 5;
	
	private double initialDurationInSeconds = DEFAULT_INITIAL_DURATION;
	private double secondsLeft = DEFAULT_INITIAL_DURATION;
	private Runnable countdownEndCallback;
	
	public void init(double durationInSeconds) {
		initialDurationInSeconds = durationInSeconds;
		reset();
	}
	
	public void reset() {
		secondsLeft = initialDurationInSeconds;
	}
	
	public void onCountdownEnd(Runnable callback) {
		countdownEndCallback = callback;
	}
	
	public double getPercentDone() {
		return 1 - (secondsLeft / initialDurationInSeconds);
	}
	
	@Override
	public void onFixedUpdate(UpdateArguments arguments) {
		if (secondsLeft > 0) {
			secondsLeft -= arguments.getSecondsSinceLastUpdate();
		}
		
		if (secondsLeft <= 0 && countdownEndCallback != null) {
			countdownEndCallback.run();
		}
	}
}
