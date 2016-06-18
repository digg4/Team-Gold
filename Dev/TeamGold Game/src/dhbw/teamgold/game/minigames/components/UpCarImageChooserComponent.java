package dhbw.teamgold.game.minigames.components;

import java.util.Random;

import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class UpCarImageChooserComponent extends Component {
	private static final String[] IMAGES = { 
			"res/img/car black up.png", 
			"res/img/car red up.png",
			"res/img/car silver up.png", 
	};
	
	private static Random random = new Random();

	@Require
	private ImageComponent imageComponent;

	public void chooseRandomImage() {
		String image = IMAGES[random.nextInt(IMAGES.length)];
		imageComponent.setImage(image);
	}
}
