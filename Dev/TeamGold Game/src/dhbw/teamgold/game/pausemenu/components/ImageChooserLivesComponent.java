package dhbw.teamgold.game.pausemenu.components;

import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.GameStatsService;

public class ImageChooserLivesComponent extends Component {
	@Require
	ImageComponent image;
	GameStatsService gameStatsService = Services.get(GameStatsService.class);
	@Override
	public void onRenderGui(RenderArguments arguments) {
		if(gameStatsService.getStats().getLives() == 3){
			image.setImage("ExitHell.png");
			System.out.print("Spieler hat nurnoch 3 Leben");
		}else if(gameStatsService.getStats().getLives() == 2){
			image.setImage("TransparentButtons.png");
			System.out.print("Spieler hat nurnoch 2 Leben");
		}else{
			image.setImage("DHBW.png");
			System.out.print("Spieler hat nurnoch 1 Leben");
		}
	}
}
