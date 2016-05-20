package dhbw.teamgold.test;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.test.prefabs.BouncingBallPrefab;

public class BallScene extends Scene {
	
	public BallScene() {
		super(SceneIds.BALL_SCENE);
	}

	@Override
	protected void initializeGameObjects() {
		addGameObject(new BouncingBallPrefab());
	}

}
