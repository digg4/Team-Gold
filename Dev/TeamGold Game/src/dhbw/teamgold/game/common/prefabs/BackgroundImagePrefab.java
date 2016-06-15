package dhbw.teamgold.game.common.prefabs;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent.RenderLayer;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;

/**
 * A BackgroundImagePrefab defines a GameObject that draws a given
 * background-image over the whole screen.
 * 
 * @author Daniel Spaniol
 */
public class BackgroundImagePrefab extends PrototypedPrefab {

	/**
	 * The image to be drawn as a background
	 */
	private String image;

	/**
	 * Creates a new BackgroundImagePrefab and defines which image is to use as
	 * a background.
	 * 
	 * @param image The background-image
	 */
	public BackgroundImagePrefab(String image) {
		this.image = image;
	}

	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent areaData = new AreaComponent(0, 0, 1, 1);
		ImageComponent imageData = new ImageComponent(image);
		ImageRendererComponent renderer = new ImageRendererComponent(RenderLayer.BACKGROUND);

		object.addComponent(areaData);
		object.addComponent(imageData);
		object.addComponent(renderer);
	}
}
