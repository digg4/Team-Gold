package dhbw.teamgold.engine.core.exception;

@SuppressWarnings("serial")
public class AssetNotFoundException extends RuntimeException {

	public AssetNotFoundException(String assetName, Throwable cause) {
		super("Could not find '" + assetName + "'", cause);
	}
	
}
