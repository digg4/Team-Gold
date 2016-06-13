package dhbw.teamgold.game.optionsmenu.components;

import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;
import dhbw.teamgold.engine.core.services.AssetsService;
import dhbw.teamgold.engine.service.Service;
import dhbw.teamgold.engine.service.Services;

public class ButtonHandlerSound extends Component {

	@Require
	AreaComponent area;

	AssetsService assetsService = Services.get(AssetsService.class);
	@Override
	public void onMouseButtonPressed(MouseButtonArguments arguments) {
		float x = arguments.getX();
		float y = arguments.getY();
		if (area.contains(x, y)) {
			assetsService.muteAll();
		}
	}
}
