package dhbw.teamgold.game.mainmenu.components;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.core.Component;

public class MainMenuBackgroundRendererComponent extends Component {

	private int width;
	private int height;
	
	@Override
	public void onInitializeGameObject(InitializeArguments arguments) {
		width = getGameObject().getScene().getSceneWidth();
		height = getGameObject().getScene().getSceneHeight();
	}
	
	@Override
	public void onRender(RenderArguments arguments) {
		Graphics g = arguments.getGraphics();
		
		String message = "Hello MainMenu";
		float middleX = (width - g.getFont().getWidth(message)) / 2;
		float middleY = (height - g.getFont().getHeight(message)) / 2;
		float x = (float) (middleX + Math.sin(System.currentTimeMillis() / 1000.0 % 1000) * 100);
		float y = (float) (middleY + Math.cos(System.currentTimeMillis() / 400.0 % 400) * 100);
		
		g.setColor(Color.red);
		g.drawString(message, x, y);
	}
	
}
