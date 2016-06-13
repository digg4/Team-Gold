package dhbw.teamgold.game.common.components;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.GameTimeService;

public class CountdownRendererComponent extends Component {
	private GameTimeService gameTimeService = Services.get(GameTimeService.class);
	
	@Require AreaComponent area;
	@Override
	public void onRenderGui(RenderArguments args){
		Graphics g = args.getGraphics();
		float x = area.getAbsoluteArea().getX();
		float y = area.getAbsoluteArea().getY();
		float width = area.getAbsoluteArea().getWidth();
		float height = area.getAbsoluteArea().getHeight();
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);
		g.setColor(Color.red);
		g.fillRect(x, y,(float)gameTimeService.getPercentOfTimeOver()*width, height);
	}
}
