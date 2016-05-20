package dhbw.teamgold.engine.behavior;

/**
 * This behavior describes all types of update-methods (this is currently only
 * the fixed-update). <br/>
 * Update-method should be used for calculating stuff so that your
 * render-methods etc don't have to do that. Also update-methods are a lot more
 * reliable since they are usually called at a fixed rate and contain additional
 * information like a time-delta for more precise calculating.
 * 
 * @author Daniel Spaniol
 */
public interface UpdateBehavior {

	/**
	 * onFixedUpdate is called 60 times a second if possible. <br/>
	 * You can override this method in order to define behavior which needs to
	 * be executed over and over again at a fixed rate (for example physics
	 * etc).
	 * 
	 * @param arguments
	 *            Some additional information which is useful for updating.
	 */
	void onFixedUpdate(UpdateArguments arguments);

}
