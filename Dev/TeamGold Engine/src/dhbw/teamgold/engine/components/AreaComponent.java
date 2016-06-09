package dhbw.teamgold.engine.components;

import org.newdawn.slick.geom.Point;
import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Scene;

/**
 * The AreaComponent saves a rectangle that defines an area in a Scene. This
 * area has relative coordinates and dimensions to the Scene.
 * 
 * @author Daniel Spaniol
 */
public class AreaComponent extends Component {

	/**
	 * The relative area to be saved.
	 */
	private Rectangle relativeArea;
	/**
	 * The absolute area according to the Scene.
	 */
	private Rectangle absoluteArea;

	/**
	 * Creates a new AreaComponent at (0, 0) with no width or height.
	 */
	public AreaComponent() {
		this(new Rectangle(0, 0, 0, 0));
	}

	/**
	 * Creates a new AreaComponent with the relative coordinates and dimensions,
	 * where 0.0 means 0% and 1.0 means 100% of the Scene.
	 * 
	 * @param relativeX
	 *            relative x in the Scene.
	 * @param relativeY
	 *            relative y in the Scene.
	 * @param relativeWidth
	 *            relative width in the Scene.
	 * @param relativeHeight
	 *            relative height in the Scene.
	 */
	public AreaComponent(float relativeX, float relativeY, float relativeWidth, float relativeHeight) {
		this(new Rectangle(relativeX, relativeY, relativeWidth, relativeHeight));
	}

	/**
	 * Creates a new AreaComponent with the relative area. For every coordinate
	 * 0.0 means 0% and 1.0 means 100% of the Scene.
	 * 
	 * @param relativeArea
	 *            relative area in the Scene.
	 */
	public AreaComponent(Rectangle relativeArea) {
		this.relativeArea = relativeArea;
	}

	@Override
	public void onInitializeGameObject(InitializeArguments arguments) {
		Scene scene = getGameObject().getScene();
		setAbsoluteArea(scene.getSceneWidth(), scene.getSceneHeight());
	}

	/**
	 * Sets the field absoluteArea how it should be according to the relative
	 * area and the Scenes dimension.
	 * 
	 * @param sceneWidth
	 *            the Scenes width
	 * @param sceneHeight
	 *            the Scenes height
	 */
	private void setAbsoluteArea(float sceneWidth, float sceneHeight) {
		float absoluteX = relativeArea.getX() * sceneWidth;
		float absoluteY = relativeArea.getY() * sceneHeight;
		float absoluteWidth = relativeArea.getWidth() * sceneWidth;
		float absoluteHeight = relativeArea.getHeight() * sceneHeight;

		absoluteArea = new Rectangle(absoluteX, absoluteY, absoluteWidth, absoluteHeight);
	}

	/**
	 * @return the absolute area in the Scene.
	 */
	public Rectangle getAbsoluteArea() {
		return absoluteArea;
	}

	/**
	 * @return the relative area as specified vby the constructor.
	 */
	public Rectangle getRelativeArea() {
		return relativeArea;
	}

	/**
	 * @param x
	 *            x-coordinate to test
	 * @param y
	 *            y-coordinate to test
	 * @return true if (x,y) lies in the absolute area, false otherwise.
	 */
	public boolean contains(float x, float y) {
		return contains(new Point(x, y));
	}

	/**
	 * @param point
	 *            point to test
	 * @return true if the point lies in the absolute area, false otherwise.
	 */
	public boolean contains(Point point) {
		return absoluteArea.contains(point);
	}

}
