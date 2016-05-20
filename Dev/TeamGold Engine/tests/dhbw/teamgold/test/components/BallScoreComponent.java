package dhbw.teamgold.test.components;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.behavior.MouseMoveArguments;
import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.core.Component;

public class BallScoreComponent extends Component {
	
	private AreaComponent areaComponent;
	
	private float mouseX;
	private float mouseY;
	
	private float timeOnBall = 0.0f;
	private float maxTimeOnBall = 0.0f;
	
	@Override
	public void onInitializeComponents(InitializeArguments arguments) {
		areaComponent = getGameObject().getComponent(AreaComponent.class);
	}
	
	@Override
	public void onFixedUpdate(UpdateArguments arguments) {
		if (areaComponent.getArea().contains(mouseX, mouseY)) {
			timeOnBall += arguments.getSecondsSinceLastUpdate();
		} else {
			timeOnBall = 0;
		}
		
		if (timeOnBall > maxTimeOnBall) {
			maxTimeOnBall = timeOnBall;
		}
	}
	
	@Override
	public void onRenderGui(RenderArguments arguments) {
		Graphics g = arguments.getGraphics();
		
		g.setColor(Color.white);
		g.drawString("Time on ball: " + timeOnBall, 100, 30);
		g.drawString("Highscore:    " + maxTimeOnBall, 100, 45);
	}
	
	@Override
	public void onMouseMove(MouseMoveArguments arguments) {
		mouseX = arguments.getX();
		mouseY = arguments.getY();
	}

}
