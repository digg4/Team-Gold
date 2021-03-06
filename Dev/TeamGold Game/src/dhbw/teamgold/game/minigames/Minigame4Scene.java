package dhbw.teamgold.game.minigames;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.engine.core.services.GameObjectService;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.prefabs.BackgroundImagePrefab;
import dhbw.teamgold.game.common.prefabs.ScoreDisplayPrefab;
import dhbw.teamgold.game.common.services.GameStatsService;
import dhbw.teamgold.game.minigames.prefabs.GameCountdownDisplayPrefab;
import dhbw.teamgold.game.minigames.prefabs.GameInfoTextDisplayPrefab;
import dhbw.teamgold.game.minigames.prefabs.TrashBinPrefab;
import dhbw.teamgold.game.minigames.prefabs.TrashBinWinChecker;
import dhbw.teamgold.game.minigames.prefabs.TrashPrefab;
import dhbw.teamgold.game.pausemenu.prefabs.LivesPrefab;

public class Minigame4Scene extends Scene {
	
	private static final float INITIAL_SECONDS = 10;
	private static final float DIFFIVULTY_FACTOR = 0.15f;
	
	private GameStatsService stats = Services.get(GameStatsService.class);
	private GameObjectService objects = Services.get(GameObjectService.class);
	
	private List<Rectangle> trashAreas = new LinkedList<>();
	private List<GameObject> trash = new LinkedList<>();

	public Minigame4Scene() {
		super(SceneIds.GAME_4);
	}

	@Override
	protected void initializeGameObjects() {
		createTrash();
		
		this.addGameObject(new GameInfoTextDisplayPrefab(getID()));
		this.addGameObject(new BackgroundImagePrefab("res/img/game4-background.png"));
		this.addGameObject(new ScoreDisplayPrefab());
		this.addGameObject(new LivesPrefab());
		this.addGameObject(new TrashBinPrefab());
		this.addGameObject(new GameCountdownDisplayPrefab(INITIAL_SECONDS, DIFFIVULTY_FACTOR));
		this.addGameObject(new TrashBinWinChecker(trash));
		trash.forEach(this::addGameObject);
	}
	
	private void createTrash() {
		trash.clear();
		trashAreas.clear();
		initAreas();
		
		for (int i = 0; i < getTrashNumber(); i++) {
			trash.add(objects.createGameObject(new TrashPrefab(trashAreas.get(i))));
		}
	}
	
	private void initAreas() {
		trashAreas.add(new Rectangle(0.01f, 0.93f, 0.07f, 0.07f));
		trashAreas.add(new Rectangle(0.2f, 0.93f, 0.07f, 0.07f));
		trashAreas.add(new Rectangle(0.33f, 0.93f, 0.07f, 0.07f));
		trashAreas.add(new Rectangle(0.6f, 0.93f, 0.07f, 0.07f));
		trashAreas.add(new Rectangle(0.77f, 0.93f, 0.07f, 0.07f));
		trashAreas.add(new Rectangle(0.92f, 0.93f, 0.07f, 0.07f));
		
		
		Collections.shuffle(trashAreas);
	}
	
	private int getTrashNumber() {
		return Math.max(1, Math.min(6, stats.getStats().getDifficulty() / 4));
	}
}
