package dhbw.teamgold.game.common.components;

import org.newdawn.slick.Image;

import dhbw.teamgold.engine.core.Component;

public class ImageComponent extends Component {

	private Image image;
	
	public void setImage(Image image) {
		this.image = image;
	}
	
	public Image getImage() {
		return image;
	}
	
}
