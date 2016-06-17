package dhbw.teamgold.game.minigames.components;

import org.newdawn.slick.Color;

import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class GameInfoTextRenderer extends Component {

	@Require
	private GameInfoTextData data;
	
	@Override
	public void onRenderGui(RenderArguments arguments) {
		arguments.getGraphics().setColor(Color.black);
		arguments.getGraphics().drawString(data.getText(), data.getAbsoluteX(), data.getAbsoluteY());
	}
	
}
