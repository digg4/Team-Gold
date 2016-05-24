package dhbw.teamgold.game.postgamescreen;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;

/**
 * A Scene that is shown whenever you end a mini-game, regardless of whether you
 * won or lost. It contains information like the current score and current lives
 * left.
 * 
 * @author Daniel Spaniol
 */
public class PostGameScreenScene extends Scene {

	public PostGameScreenScene() {
		super(SceneIds.POST_GAME_SCREEN);
	}

	@Override
	protected void initializeGameObjects() {
	}

}
