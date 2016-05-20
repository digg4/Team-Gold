package dhbw.teamgold.engine.core.exception;

import dhbw.teamgold.engine.core.Component;

/**
 * This exception is thrown when you try to access a Component from a GameObject
 * which does not have any onstance of that Component.
 * 
 * @author Daniel Spaniol
 */
@SuppressWarnings("serial")
public class NoSuchComponentException extends RuntimeException {

	/**
	 * Creates a new exception with information about which type of Component
	 * was not found.
	 * 
	 * @param type
	 *            The type of the Component.
	 */
	public NoSuchComponentException(Class<? extends Component> type) {
		super("There is no component of type '" + type.getName() + "' attached to hhat GameObject.");
	}

}
