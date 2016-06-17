package dhbw.teamgold.game.minigames;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import org.newdawn.slick.geom.Point;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.prefabs.BackgroundImagePrefab;
import dhbw.teamgold.game.common.prefabs.ScoreDisplayPrefab;
import dhbw.teamgold.game.common.services.GameStatsService;
import dhbw.teamgold.game.minigames.components.CableDataComponent;
import dhbw.teamgold.game.minigames.prefabs.BlueCablePrefab;
import dhbw.teamgold.game.minigames.prefabs.CablesWinCheckerPrefab;
import dhbw.teamgold.game.minigames.prefabs.GameCountdownDisplayPrefab;
import dhbw.teamgold.game.minigames.prefabs.GreenCablePrefab;
import dhbw.teamgold.game.minigames.prefabs.RedCablePrefab;
import dhbw.teamgold.game.minigames.prefabs.YellowCablePrefab;
import dhbw.teamgold.game.pausemenu.prefabs.LivesPrefab;

public class Minigame3Scene extends Scene {
	
	private static final float INITIAL_SECONDS = 8f;
	private static final float DIFFICULTY_FACTOR = 0.2f;
	
	private List<Point> startPoints = new LinkedList<>();
	private List<Point> endPoints = new LinkedList<>();

	private GameObject redCable;
	private GameObject greenCable;
	private GameObject blueCable;
	private GameObject yellowCable;

	public Minigame3Scene() {
		super(SceneIds.GAME_3);
	}

	private void initStartPoints() {
		startPoints.clear();
		startPoints.add(new Point(0.48f, 0.43f));
		startPoints.add(new Point(0.55f, 0.45f));
		startPoints.add(new Point(0.56f, 0.36f));
		startPoints.add(new Point(0.47f, 0.35f));
		Collections.shuffle(startPoints);
	}

	private void initEndPoints() {
		endPoints.clear();
		endPoints.add(new Point(0.30f, 0.41f));
		endPoints.add(new Point(0.37f, 0.43f));
		endPoints.add(new Point(0.38f, 0.34f));
		endPoints.add(new Point(0.29f, 0.33f));
		Collections.shuffle(endPoints);
	}

	private void initCables() {
		redCable = createGameObject(new RedCablePrefab(startPoints.get(0), endPoints.get(0)));
		greenCable = createGameObject(new GreenCablePrefab(startPoints.get(1), endPoints.get(1)));
		blueCable = createGameObject(new BlueCablePrefab(startPoints.get(2), endPoints.get(2)));
		yellowCable = createGameObject(new YellowCablePrefab(startPoints.get(3), endPoints.get(3)));
	}

	@Override
	protected void initializeGameObjects() {
		initStartPoints();
		initEndPoints();
		initCables();

		this.addGameObject(new BackgroundImagePrefab("res/img/game3-background.png"));
		this.addGameObject(new ScoreDisplayPrefab());
		this.addGameObject(new LivesPrefab());
		
		this.addGameObject(redCable);
		this.addGameObject(greenCable);
		this.addGameObject(blueCable);
		this.addGameObject(yellowCable);
		this.addGameObject(new CablesWinCheckerPrefab(redCable, blueCable, greenCable, yellowCable));
		this.addGameObject(new GameCountdownDisplayPrefab(INITIAL_SECONDS, DIFFICULTY_FACTOR));
	}
}
