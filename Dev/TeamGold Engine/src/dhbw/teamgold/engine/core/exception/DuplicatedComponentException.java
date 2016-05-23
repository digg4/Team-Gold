package dhbw.teamgold.engine.core.exception;

import dhbw.teamgold.engine.core.Component;

/**
 * This exception is thrown when you try to add a Component to a GameObject
 * which already has an instance of that Component-type.
 * 
 * @author Daniel Spaniol
 */
@SuppressWarnings("serial")
public class DuplicatedComponentException extends RuntimeException {

	/**
	 * Creates a new exception with information about which type of component
	 * you tried to add a second time.
	 * 
	 * @param type
	 *            The type of the Component.
	 */
	public DuplicatedComponentException(Class<? extends Component> type) {
		super("There is already a component of type '" + type.getName() + "' attached to that GameObject");
	}

}
