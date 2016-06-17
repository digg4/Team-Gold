package dhbw.teamgold.game.minigames.prefabs;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.minigames.components.CablesWinCheckerComponent;

public class CablesWinCheckerPrefab extends PrototypedPrefab {

	private GameObject[] cables;

	public CablesWinCheckerPrefab(GameObject... cables) {
		this.cables = cables;
	}

	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new CablesWinCheckerComponent(cables));
	}

}
