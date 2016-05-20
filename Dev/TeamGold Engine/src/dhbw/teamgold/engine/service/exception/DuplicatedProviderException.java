package dhbw.teamgold.engine.service.exception;

import dhbw.teamgold.engine.service.Service;

/**
 * This exception is thrown when you try to register a Provider for a
 * ServiceType which already has a Provider registered.
 * 
 * @author Daniel Spaniol
 */
@SuppressWarnings("serial")
public class DuplicatedProviderException extends RuntimeException {

	/**
	 * Creates a new exception with information about which ServiceType for
	 * which you tried to register two Providers for.
	 * 
	 * @param serviceType
	 *            The type of Service you tried to register a second Provider
	 *            for.
	 */
	public DuplicatedProviderException(Class<? extends Service> serviceType) {
		super("There is already a Provider registered to create a Service of type '" + serviceType.getName() + "'");
	}

}
