package dhbw.teamgold.game.components;

import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.core.Component;

/**
 * A Component that describes how a countdown works. You may provide how long
 * the countdown needs to tick down and what to do when it has ticked down.
 * 
 * @author Daniel Spaniol
 */
public class CountdownComponent extends Component {

	/**
	 * The default-duration in seconds the countdown will take to tick down when
	 * no otehr value is provided.
	 */
	private static final double DEFAULT_INITIAL_DURATION = 5;

	/**
	 * A field that saves how long this countdown needs to tick down.
	 */
	private double initialDurationInSeconds = DEFAULT_INITIAL_DURATION;
	/**
	 * The time left on the current countdown.
	 */
	private double secondsLeft = DEFAULT_INITIAL_DURATION;
	/**
	 * The method to execute when the countdown finished.
	 */
	private Runnable countdownEndCallback;

	/**
	 * Sets the duration this countdown needs to tick down. Also resets the
	 * countdown.
	 * 
	 * @param durationInSeconds
	 *            The duration this countdown will take.
	 */
	public void init(double durationInSeconds) {
		initialDurationInSeconds = durationInSeconds;
		reset();
	}

	/**
	 * Sets the seconds left to the duration the countdown will take to tick
	 * down.
	 */
	public void reset() {
		secondsLeft = initialDurationInSeconds;
	}

	/**
	 * Sets the function that will be called when the countdown has ticked down.
	 * 
	 * @param callback
	 *            The function to execute.
	 */
	public void onCountdownEnd(Runnable callback) {
		countdownEndCallback = callback;
	}

	/**
	 * @return How much of the time has ticked down.<br/>
	 *         0.0 means 0% is done, 1.0 means 100% are done.
	 */
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
