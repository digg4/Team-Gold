package dhbw.teamgold.game.statsscreen.prefabs;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.TextComponent;
import dhbw.teamgold.engine.components.TextRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.statsscreen.components.WinLoseTextChooser;

public class WinLoseTextDisplayPrefab extends PrototypedPrefab {

	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new TextComponent());
		object.addComponent(new TextRendererComponent());
		object.addComponent(new AreaComponent(0, 0.2f, 1, 0.1f));
		object.addComponent(new WinLoseTextChooser());
	}

}
