package dhbw.teamgold.game.minigames.components;

import org.newdawn.slick.Image;

import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class WaterTapRenderer extends Component {

	@Require
	private WaterTapTransfromComponent transform;

	@Require
	private ImageComponent imageComponent;

	@Override
	public void onUpdate(UpdateArguments arguments) {
		imageComponent.getImage().setRotation(transform.getRotation() * 180 / (float) Math.PI);
	}
	
	@Override
	public void onRender(RenderArguments arguments) {
		Image image = imageComponent.getImage();
		float x = transform.getBounds().getCenterX() - image.getWidth() / 2;
		float y = transform.getBounds().getCenterY() - image.getHeight() / 2; 
		
		image.draw(x, y);
	}

}
