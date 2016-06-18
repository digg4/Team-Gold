package dhbw.teamgold.game.minigames;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.prefabs.BackgroundImagePrefab;
import dhbw.teamgold.game.common.prefabs.ScoreDisplayPrefab;
import dhbw.teamgold.game.minigames.prefabs.GameInfoTextDisplayPrefab;
import dhbw.teamgold.game.minigames.prefabs.TrafficLightControllerPrefab;
import dhbw.teamgold.game.minigames.prefabs.TrafficLightFarPrefab;
import dhbw.teamgold.game.minigames.prefabs.TrafficLightNearPrefab;
import dhbw.teamgold.game.minigames.prefabs.UpCarPrefab;
import dhbw.teamgold.game.minigames.prefabs.DownCarPrefab;
import dhbw.teamgold.game.minigames.prefabs.GameCountdownDisplayPrefab;
import dhbw.teamgold.game.pausemenu.prefabs.LivesPrefab;

public class Minigame5Scene extends Scene {

	private static final float INITIAL_TIME = 10;
	private static final float DIFFICULTY_FACTOR = 0.4f;
	
	public Minigame5Scene() {
		super(SceneIds.GAME_5);
	}

	@Override
	protected void initializeGameObjects() {
		GameObject farTrafficLight = createGameObject(new TrafficLightFarPrefab());
		GameObject nearTrafficLight = createGameObject(new TrafficLightNearPrefab());
		
		this.addGameObject(new BackgroundImagePrefab("res/img/game5-background.png"));
		this.addGameObject(new ScoreDisplayPrefab());
		this.addGameObject(new LivesPrefab());
		this.addGameObject(new GameInfoTextDisplayPrefab(SceneIds.GAME_5));
		this.addGameObject(new GameCountdownDisplayPrefab(INITIAL_TIME, DIFFICULTY_FACTOR));
		this.addGameObject(farTrafficLight);
		this.addGameObject(nearTrafficLight);
		this.addGameObject(new TrafficLightControllerPrefab(farTrafficLight, nearTrafficLight));
		this.addGameObject(new DownCarPrefab());
		this.addGameObject(new UpCarPrefab());
	}
}
