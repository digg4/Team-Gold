package dhbw.teamgold.engine.components;

import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

/**
 * Renders the Image provided by the GameObjects ImageComponent at the area
 * provided by the GameObjects AReaComponent.
 * 
 * @author Daniel Spaniol
 */
public class ImageRendererComponent extends Component {

	/**
	 * The layer in which the image will be drawn.
	 */
	private RenderLayer layer;

	@Require
	private ImageComponent image;

	@Require
	private AreaComponent area;

	/**
	 * Creates a new ImageRendererComponent that will draw the Image in the
	 * game-layer.
	 */
	public ImageRendererComponent() {
		this(RenderLayer.GAME);
	}

	/**
	 * Creates a new ImageRendererComponent that will draw the Image in the
	 * given layer.
	 * 
	 * @param layer
	 *            The layer to draw the Image in.
	 */
	public ImageRendererComponent(RenderLayer layer) {
		this.layer = layer;
	}

	/**
	 * Draws the image at the area provided by the AreaComponent.
	 */
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

	/**
	 * Describes the possible layers in which the Image can be drawn. 
	 * 
	 * @author Daniel Spaniol
	 */
	public static enum RenderLayer {
		BACKGROUND, GAME, GUI
	}

}
