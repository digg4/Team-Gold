package dhbw.teamgold.engine.behavior;

/**
 * These arguments contain some additional information which may be useful in
 * update-methods.
 * 
 * @author Daniel Spaniol
 */
public interface UpdateArguments {

	/**
	 * @return The seconds passed since the last update-call.
	 */
	double getSecondsSinceLastUpdate();

	/**
	 * This delta describes how good updating works. If the delta is bigger than
	 * 1.0 it means that updating happens slower than it should. If the delta is
	 * smaller than 1.0 it means that updating happens faster than it should.
	 * Here I assume that updating should happen 60 times per seconds even if
	 * you specified another value or no cap at all.<br/>
	 * This is useful when you have calculations that need to be exact and
	 * should not be affected by how fast the game is actually running. <br/>
	 * For example consider the following code:
	 * 
	 * <pre>
	 * public void onFixedUpdate(UpdateArguments args) {
	 * 	this.x += this.speed * args.getDelta();
	 * }
	 * </pre>
	 * 
	 * By multiplying the speed with the time delta you make this motion very
	 * smooth since no matter how fast/slow the game runs, the agend will run at
	 * a constant speed.
	 * 
	 * @return The time delta.
	 */
	double getDelta();

}
