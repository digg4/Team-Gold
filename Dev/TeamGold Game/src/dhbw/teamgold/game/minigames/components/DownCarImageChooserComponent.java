package dhbw.teamgold.game.minigames.components;

import java.util.Random;

import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class DownCarImageChooserComponent extends Component {

	private static final String[] IMAGES = { 
			"res/img/car black.png", 
			"res/img/car red.png",
			"res/img/car silver.png", 
	};
	
	private static Random random = new Random();

	@Require
	private ImageComponent imageComponent;

	public void chooseRandomImage() {
		String image = IMAGES[random.nextInt(IMAGES.length)];
		imageComponent.setImage(image);
	}

}
