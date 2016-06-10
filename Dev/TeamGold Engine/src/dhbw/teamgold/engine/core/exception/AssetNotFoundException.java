package dhbw.teamgold.engine.core.exception;

/**
 * This Exception is thrown when you try to request a resource that cannot be
 * found.
 * 
 * @author Daniel Spaniol
 */
@SuppressWarnings("serial")
public class AssetNotFoundException extends RuntimeException {

	/**
	 * Creates a new Exception with information about which resource was not
	 * found.
	 * 
	 * @param assetName
	 *            The name of the resource which was not found.
	 */
	public AssetNotFoundException(String assetName) {
		super("Could not find '" + assetName + "'");
	}
	
	/**
	 * Creates a new Exception with information about which resource was not
	 * found.
	 * 
	 * @param assetName
	 *            The name of the resource which was not found.
	 * @param cause
	 *            The exception that was originally thrown because the resource
	 *            is missing.
	 */
	public AssetNotFoundException(String assetName, Throwable cause) {
		super("Could not find '" + assetName + "'", cause);
	}

}
