package dhbw.teamgold.test.components;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.core.Component;

public class AreaComponent extends Component {

	private Rectangle area;
	
	public Rectangle getArea() {
		return area;
	}
	
	public void setArea(Rectangle area) {
		this.area = area;
	}
	
}
