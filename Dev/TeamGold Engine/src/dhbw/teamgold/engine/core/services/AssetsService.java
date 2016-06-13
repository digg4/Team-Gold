package dhbw.teamgold.engine.core.services;

import org.newdawn.slick.Image;
import org.newdawn.slick.Sound;

import dhbw.teamgold.engine.core.exception.AssetNotFoundException;
import dhbw.teamgold.engine.service.Service;

/**
 * A Service to provide access to all kind of assets. These are ressources such
 * as Images and Sounds.
 * 
 * @author Daniel Spaniol
 */
public interface AssetsService extends Service {

	/**
	 * Looks up for the given Image. This will load the Image the first time it
	 * is requested and later on use a cache to get the Image.
	 * 
	 * @param name
	 *            The (file-)name of the Image to look up.
	 * @return The requested Image.
	 * @throws AssetNotFoundException
	 *             Thrown when the Image cannot be found by the file-system.
	 */
	Image getImage(String name) throws AssetNotFoundException;

	/**
	 * Looks up for the given Sound. This will load the Sound the first time it
	 * is requested and later on user a cache to get the Sound.
	 * 
	 * @param name
	 *            The (file-)name of the Sound to look up.
	 * @return The requested Sound.
	 * @throws AssetNotFoundException
	 *             Thrown when the Sound cannot be found by the
	 */
	Sound getSound(String name) throws AssetNotFoundException;
	/**
	 *	mutes All sounds saved in soundCache are going to be muted if they were muted before 
	 */
	void muteAll();

}
