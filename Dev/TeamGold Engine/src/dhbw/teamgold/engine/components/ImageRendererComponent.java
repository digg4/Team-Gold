package dhbw.teamgold.engine.components;

import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class ImageRendererComponent extends Component {

	private RenderLayer layer;
	
	@Require
	private ImageComponent image;
	
	@Require
	private AreaComponent area;
	
	public ImageRendererComponent() {
		this(RenderLayer.GAME);
	}
	
	public ImageRendererComponent(RenderLayer layer) {
		this.layer = layer;
	}
	
	private void drawImage() {
		float x = area.getAbsoluteArea().getX();
		float y = area.getAbsoluteArea().getY();
		float width = area.getAbsoluteArea().getWidth();
		float height = area.getAbsoluteArea().getHeight();
		
		image.getImage().draw(x, y, width, height);
	}
	
	@Override
	public void onRender(RenderArguments arguments) {
		if (layer == RenderLayer.GAME) {
			drawImage();
		}
	}
	
	@Override
	public void onRenderBackground(RenderArguments arguments) {
		if (layer == RenderLayer.BACKGROUND) {
			drawImage();
		}
	}
	
	@Override
	public void onRenderGui(RenderArguments arguments) {
		if (layer == RenderLayer.GUI) {
			drawImage();
		}
	}

	public static enum RenderLayer {
		BACKGROUND, GAME, GUI
	}
	
}
