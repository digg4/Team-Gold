package dhbw.teamgold.game.minigames.prefabs;

import java.util.List;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.minigames.components.TrashBinWinCheckerComponent;

public class TrashBinWinChecker extends PrototypedPrefab {

	private List<GameObject> trash;
	
	public TrashBinWinChecker(List<GameObject> trash) {
		this.trash = trash;
	}
	
	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new TrashBinWinCheckerComponent(trash));
	}

}
