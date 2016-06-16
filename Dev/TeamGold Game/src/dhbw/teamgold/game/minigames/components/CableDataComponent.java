package dhbw.teamgold.game.minigames.components;

import org.newdawn.slick.Color;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Point;
import org.newdawn.slick.geom.Shape;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.core.Component;

public class CableDataComponent extends Component {
	
	public static final float WIDTH = 10f;
	public static final float HEIGHT = 100f;
	private static final float DRAG_RADIUS = 10f;

	private Color color;
	private Shape start;
	private Shape end;
	private Point drag;
	private Point startPoint;
	private Point endPoint;
	private boolean resetDrag = false;
	
	public CableDataComponent(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	@Override
	public void onInitializeGameObject(InitializeArguments arguments) {
		float width = getGameObject().getScene().getSceneWidth();
		float height = getGameObject().getScene().getSceneHeight();

		start = new Circle(startPoint.getX() * width, startPoint.getY() * height, WIDTH);
		end = new Circle(endPoint.getX() * width, endPoint.getY() * height, WIDTH);
		drag = new Point(startPoint.getX() * width, startPoint.getY() * height + HEIGHT);
	}
	
	public boolean dragContains(float x, float y) {
		return new Circle(drag.getX(), drag.getY(), DRAG_RADIUS).contains(x, y);
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Shape getStart() {
		return start;
	}

	public void setStart(Shape start) {
		this.start = start;
	}

	public Shape getEnd() {
		return end;
	}

	public void setEnd(Shape end) {
		this.end = end;
	}

	public Point getDrag() {
		return drag;
	}

	public void setDrag(Point drag) {
		this.drag = drag;
	}

	public boolean isResetDrag() {
		return resetDrag;
	}

	public void setResetDrag(boolean resetDrag) {
		this.resetDrag = resetDrag;
	}

}
