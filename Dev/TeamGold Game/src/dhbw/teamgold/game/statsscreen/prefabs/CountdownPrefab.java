package dhbw.teamgold.game.statsscreen.prefabs;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.mainmenu.components.CountdownComponent;

public class CountdownPrefab extends PrototypedPrefab {
	private Runnable callback;

	public CountdownPrefab(Runnable callback) {
		this.callback = callback;
	}

	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent();
		CountdownComponent countdown = new CountdownComponent();
		countdown.onEnd(callback);
		object.addComponent(area);
		object.addComponent(countdown);

	}

}
