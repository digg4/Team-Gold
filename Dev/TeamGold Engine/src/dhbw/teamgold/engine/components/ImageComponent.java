package dhbw.teamgold.engine.components;

import org.newdawn.slick.Image;

import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.services.AssetsService;
import dhbw.teamgold.engine.service.Services;

public class ImageComponent extends Component {
	
	private Image image;
	
	public ImageComponent(Image image) {
		this.image = image;
	}
	
	public ImageComponent(String imageFile) {
		this(Services.get(AssetsService.class).getImage(imageFile));
	}
	
	public Image getImage() {
		return image;
	}
	
}
