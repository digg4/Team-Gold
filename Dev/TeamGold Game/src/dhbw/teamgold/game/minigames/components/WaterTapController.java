package dhbw.teamgold.game.minigames.components;

import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.MiniGameSelectorService;

public class WaterTapController extends Component {

	private static final float RADIANS_PER_TICK = (float) (Math.PI / 12);
	private static final int CLICKS_TO_WIN = 20;

	private MiniGameSelectorService miniGameSelectorService = Services.get(MiniGameSelectorService.class);

	@Require
	private WaterTapTransfromComponent transform;

	private int remainingTicks = CLICKS_TO_WIN;

	@Override
	public void onMouseButtonPressed(MouseButtonArguments arguments) {
		if (transform.getBounds().contains(arguments.getX(), arguments.getY())) {
			transform.rotate(RADIANS_PER_TICK);
			remainingTicks--;
			checkForWin();
		}
	}

	private void checkForWin() {
		if (remainingTicks <= 0) {
			getGameObject().getScene().switchScene(miniGameSelectorService.getNextMiniGameId());
		}
	}
}
