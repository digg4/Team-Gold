package dhbw.teamgold.engine.behavior;

/**
 * Implementation of UpdateArguments. Basically just saves the delta.
 * 
 * @author Daniel Spaniol
 */
public class UpdateArgumentsImpl implements UpdateArguments {

	private static final double OPTIMAL_SECONDS_PER_UPDATE = 1.0 / 60.0;
	
	private double secondsSinceLastUpdate;

	public void setSecondsSinceLastUpdate(double secondsSinceLastUpdate) {
		this.secondsSinceLastUpdate = secondsSinceLastUpdate;
	}

	@Override
	public double getSecondsSinceLastUpdate() {
		return secondsSinceLastUpdate;
	}

	@Override
	public double getDelta() {
		return secondsSinceLastUpdate / OPTIMAL_SECONDS_PER_UPDATE;
	}

}
