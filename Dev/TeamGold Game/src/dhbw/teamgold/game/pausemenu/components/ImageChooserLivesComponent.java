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
	}
}
