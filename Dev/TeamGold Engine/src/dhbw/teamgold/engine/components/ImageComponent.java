package dhbw.teamgold.engine.components;

import org.newdawn.slick.Image;

import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.services.AssetsService;
import dhbw.teamgold.engine.service.Services;

/**
 * Component to save an image. This is useful for the ImageRendererComponent.
 * 
 * @author Daniel Spaniol
 */
public class ImageComponent extends Component {

	/**
	 * The image this component saves.
	 */
	private Image image;

	/**
	 * Creates a new ImageComponent that saves the given Image.
	 * 
	 * @param image
	 *            The Image to save
	 */
	public ImageComponent(Image image) {
		this.image = image;
	}

	/**
	 * Creates a new ImageComponent, requests and saves the given Image.
	 * 
	 * @param imageFile
	 *            The name of the image to save.
	 */
	public ImageComponent(String imageFile) {
		this(Services.get(AssetsService.class).getImage(imageFile));
	}

	/**
	 * @return The Image saved by this Component.
	 */
	public Image getImage() {
		return image;
	}
}
