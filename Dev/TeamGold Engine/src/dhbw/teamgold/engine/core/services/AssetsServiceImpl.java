package dhbw.teamgold.engine.core.services;

import java.util.HashMap;
import java.util.Map;

import org.newdawn.slick.Image;
import org.newdawn.slick.Sound;

import dhbw.teamgold.engine.core.exception.AssetNotFoundException;

public class AssetsServiceImpl implements AssetsService {

	private Map<String, Image> imageCache = new HashMap<>();
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

}
