package dhbw.teamgold.game.statsscreen.components;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.components.TextComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.WinLoseTextService;

public class WinLoseTextChooser extends Component {

	@Require
	private TextComponent text;
	
	@Override
	public void onInitializeGameObject(InitializeArguments arguments) {
		text.setText(Services.get(WinLoseTextService.class).getCurrentText());
	}
	
}
