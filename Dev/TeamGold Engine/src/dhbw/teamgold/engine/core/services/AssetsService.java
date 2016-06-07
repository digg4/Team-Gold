package dhbw.teamgold.engine.core.services;

import org.newdawn.slick.Image;
import org.newdawn.slick.Sound;

import dhbw.teamgold.engine.core.exception.AssetNotFoundException;
import dhbw.teamgold.engine.service.Service;

public interface AssetsService extends Service {

	Image getImage(String name) throws AssetNotFoundException;
	
	Sound getSound(String name) throws AssetNotFoundException;
	
}
