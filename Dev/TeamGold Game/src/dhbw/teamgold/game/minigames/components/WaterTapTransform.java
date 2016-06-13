package dhbw.teamgold.game.minigames.components;

import dhbw.teamgold.engine.core.Component;

public class WaterTapTransform extends Component {

	private float x;
	private float y;
	private float width;
	private float height;
	private float angle;

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getAngle() {
		return angle;
	}

	public void setAngle(float angle) {
		this.angle = angle;
	}
	
	public float getMiddleX() {
		return x + width / 2;
	}
	
	public float getMiddleY() {
		return y + height / 2;
	}

}
