package dhbw.teamgold.engine.service.exception;

import dhbw.teamgold.engine.service.Service;

/**
 * This exception is thrown when you try to request a Service which does not
 * have a Provider registered.
 * 
 * @author Daniel Spaniol
 */
@SuppressWarnings("serial")
public class NoSuchProviderException extends RuntimeException {

	/**
	 * Creates a new exception with information about which type of Service has
	 * no Provider registered.
	 * 
	 * @param type
	 *            The type of Service which has no Provider registered.
	 */
	public NoSuchProviderException(Class<? extends Service> type) {
		super("There is no Provider registered to create a Service of type '" + type.getName() + "'");
	}

}
