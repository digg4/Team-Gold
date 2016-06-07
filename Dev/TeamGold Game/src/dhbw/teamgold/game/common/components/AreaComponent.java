package dhbw.teamgold.game.common.components;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.core.Component;

public class AreaComponent extends Component {

	private Rectangle area;

	public AreaComponent(float x, float y, float width, float height) {
		area = new Rectangle(x, y, width, height);
	}

	public AreaComponent() {
		this(0, 0, 0, 0);
	}
	
	public Rectangle getArea() {
		return area;
	}
	
	public void setArea(Rectangle area) {
		this.area = area;
	}

}
