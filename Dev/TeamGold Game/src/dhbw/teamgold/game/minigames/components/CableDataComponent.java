package dhbw.teamgold.game.minigames.components;

import org.newdawn.slick.Color;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Point;
import org.newdawn.slick.geom.Shape;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class CableDataComponent extends Component {
	
	public static final float WIDTH = 10f;
	public static final float HEIGHT = 100f;
	private static final float DRAG_RADIUS = 10f;

	@Require
	private CableDifficultyAdapter difficultyAdapter;
	
	private Color color;
	private Shape start;
	private Shape end;
	private Point drag;
	private Point startPoint;
	private Point endPoint;
	private boolean isFinished;
	
	private float sceneWidth;
	private float sceneHeight;
	
	public CableDataComponent(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	@Override
	public void onInitializeGameObject(InitializeArguments arguments) {
		sceneWidth = getGameObject().getScene().getSceneWidth();
		sceneHeight = getGameObject().getScene().getSceneHeight();

		start = new Circle(startPoint.getX() * sceneWidth, startPoint.getY() * sceneHeight, WIDTH);
		end = new Circle(endPoint.getX() * sceneWidth, endPoint.getY() * sceneHeight, WIDTH);
		resetDrag();
		
		difficultyAdapter.adaptDifficulty(this);
	}
	
	public void resetDrag() {
		drag = new Point(startPoint.getX() * sceneWidth, startPoint.getY() * sceneHeight + HEIGHT);
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

	public boolean isFinished() {
		return isFinished;
	}

	public void setFinished(boolean isFinished) {
		if (isFinished) {
			this.drag = new Point(end.getCenterX(), end.getCenterY());
		}
		
		this.isFinished = isFinished;
	}

}
