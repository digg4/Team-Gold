package dhbw.teamgold.game.splashscreen.components;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.game.components.CountdownComponent;

public class SplashScreenTimerRendererComponent extends Component {

	private CountdownComponent countdownComponent;
	
	@Override
	public void onInitializeComponents(InitializeArguments arguments) {
		countdownComponent = getGameObject().getComponent(CountdownComponent.class);
	}	
	
	@Override
	public void onRender(RenderArguments arguments) {
		Graphics g = arguments.getGraphics();
		
		drawClock(g);
	}

	private void drawClock(Graphics g) {
		float startAngle = 270;
		float endAngle = (float) (startAngle + 360 * countdownComponent.getPercentDone());
		
		float x = 10;
		float y = 10;
		float width = 50;
		float height = 50;
		
		g.setColor(Color.yellow);
		g.fillArc(x, y, width, height, startAngle, endAngle);
		g.setColor(Color.green);
		g.drawArc(x, y, width, height, startAngle, endAngle);
	}
}
