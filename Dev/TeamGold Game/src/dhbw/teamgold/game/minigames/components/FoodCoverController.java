package dhbw.teamgold.game.minigames.components;

import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.services.WinLoseService;

public class FoodCoverController extends Component {

	private WinLoseService winLoseService = Services.get(WinLoseService.class);

	@Require
	private FoodCoverAnimator animator;

	@Require
	private AreaComponent area;

	private final OnClickAction onClickAction;

	public FoodCoverController(OnClickAction onClickAction) {
		this.onClickAction = onClickAction;
	}

	@Override
	public void onMouseButtonPressed(MouseButtonArguments arguments) {
		if (animator.isFinished() && area.contains(arguments.getX(), arguments.getY())) {
			if (onClickAction == OnClickAction.WIN) {
				winLoseService.win();
			} else {
				winLoseService.lose();
			}
			getGameObject().getScene().switchScene(SceneIds.STATS_SCREEN);
		}
	}

	public static enum OnClickAction {
		LOSE, WIN
	}

}
