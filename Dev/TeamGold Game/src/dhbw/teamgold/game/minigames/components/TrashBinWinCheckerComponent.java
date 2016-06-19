package dhbw.teamgold.game.minigames.components;

import java.util.List;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.services.WinLoseService;

public class TrashBinWinCheckerComponent extends Component {

	private WinLoseService winLoseService = Services.get(WinLoseService.class);
	
	private List<GameObject> trash;
	private Rectangle winArea = new Rectangle(0.45f, 0.5f, 0.1f, 0.2f);
	
	public TrashBinWinCheckerComponent(List<GameObject> trash) {
		this.trash = trash;
	}
	
	@Override
	public void onInitializeGameObject(InitializeArguments arguments) {
		int width = getGameObject().getScene().getSceneWidth();
		int height = getGameObject().getScene().getSceneHeight();

		winArea.setX(winArea.getX() * width);
		winArea.setY(winArea.getY() * height);
		winArea.setWidth(winArea.getWidth() * width);
		winArea.setHeight(winArea.getHeight() * height);
	}
	
	@Override
	public void onUpdate(UpdateArguments arguments) {
		if (allTrashInBin()) {
			winLoseService.win();
			getGameObject().getScene().switchScene(SceneIds.STATS_SCREEN);
		}
	}
	
	private boolean allTrashInBin() {
		return trash.stream()
				.map(object -> object.getComponent(AreaComponent.class).getAbsoluteArea())
				.allMatch(area -> winArea.intersects(area));
	}
	
}
