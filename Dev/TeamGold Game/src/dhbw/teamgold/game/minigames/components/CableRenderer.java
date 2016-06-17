package dhbw.teamgold.game.minigames.components;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Point;
import org.newdawn.slick.geom.Shape;

import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class CableRenderer extends Component {

	@Require
	private CableDataComponent data;

	@Override
	public void onRender(RenderArguments arguments) {
		Graphics g = arguments.getGraphics();
		Color color = data.getColor();
		Shape start = data.getStart();
		Shape end = data.getEnd();

		g.setColor(color);
		g.fill(start);
		g.fill(end);
	}

	@Override
	public void onRenderGui(RenderArguments arguments) {
		Graphics g = arguments.getGraphics();
		Color color = data.getColor();
		Shape start = data.getStart();
		Point startPoint = new Point(start.getCenterX(), start.getCenterY());
		Point dragPoint = data.getDrag();

		g.setColor(color);
		g.setLineWidth(CableDataComponent.WIDTH);
		g.drawLine(startPoint.getX(), startPoint.getY(), dragPoint.getX(), dragPoint.getY());
	}

}
