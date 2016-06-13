package dhbw.teamgold.engine.core.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.newdawn.slick.Image;
import org.newdawn.slick.Sound;

import dhbw.teamgold.engine.core.exception.AssetNotFoundException;
import dhbw.teamgold.engine.service.Provider;

/**
 * Provides the AssetsService.
 * 
 * @author Daniel Spaniol
 */
public class AssetsServiceProvider implements Provider<AssetsService> {

	@Override
	public AssetsService createService() {
		return new AssetsServiceImpl();
	}

	@Override
	public Class<AssetsService> getType() {
		return AssetsService.class;
	}

	/**
	 * The implementation of the AssetService.
	 * 
	 * @author Daniel Spaniol
	 */
	private static class AssetsServiceImpl implements AssetsService {

		/**
		 * Cache of all Images loaded.
		 */
		private Map<String, Image> imageCache = new HashMap<>();
		/**
		 * Cache of all Sounds loaded.
		 */
		private Map<String, Sound> soundCache = new HashMap<>();

		@Override
		public Image getImage(String name) throws AssetNotFoundException {
			if (imageCache.containsKey(name)) {
				return imageCache.get(name);
			}

			try {
				Image image = new Image(name);
				imageCache.put(name, image);

				return image;
			} catch (Exception e) {
				throw new AssetNotFoundException(name, e);
			}
		}

		@Override
		public Sound getSound(String name) throws AssetNotFoundException {
			if (soundCache.containsKey(name)) {
				return soundCache.get(name);
			}

			try {
				Sound sound = new Sound(name);
				soundCache.put(name, sound);

				return sound;
			} catch (Exception e) {
				throw new AssetNotFoundException(name, e);
			}
		}

		@Override
		public void muteAll() {
			Set<String> keys = soundCache.keySet();
			keys.forEach(Key -> soundCache.get(Key).stop());
		}
	}
}
