package dhbw.teamgold.engine.behavior;

/**
 * This behavior describes all types of render-methods. <br/>
 * Basically rendering comes in 3 different layers.
 * <ul>
 * <li>The first one is <i>background-rendering</i></li>
 * <li>After that comes the <i>normal rendering</i></li>
 * <li>And at the end comes <i>GUI-rendering</i></li>
 * </ul>
 * The rendering methods are called in exactly that order which leads the
 * background to be rendered in back of the game-stuff and the GUI is rendered
 * in front of everything else.
 * 
 * @author Daniel Spaniol
 */
public interface RenderBehavior {

	/**
	 * The render-method to be called between GUI and background. Because of
	 * that, everything in here will be rendered above the background but
	 * beneath the GUI.
	 * 
	 * @param arguments
	 *            Additional information needed for rendering.
	 */
	void onRender(RenderArguments arguments);

	/**
	 * The last render-method to be called. Everything GUI-related should be
	 * rendered inside here since that will be rendered in front of everything
	 * else.
	 * 
	 * @param arguments
	 *            Additional information needed for rendering.
	 */
	void onRenderGui(RenderArguments arguments);

	/**
	 * The first render-method to be called. Everything that belongs to the
	 * background should be rendered inside here since everything else will be
	 * rendered in front of that.
	 * 
	 * @param arguments
	 *            Additional information needed for rendering.
	 */
	void onRenderBackground(RenderArguments arguments);

}
