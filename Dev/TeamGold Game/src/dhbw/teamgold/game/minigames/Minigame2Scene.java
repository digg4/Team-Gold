package dhbw.teamgold.game.minigames;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.prefabs.BackgroundImagePrefab;
import dhbw.teamgold.game.common.prefabs.ScoreDisplayPrefab;
import dhbw.teamgold.game.minigames.components.FoodCoverController.OnClickAction;
import dhbw.teamgold.game.minigames.prefabs.ApplePiePrefab;
import dhbw.teamgold.game.minigames.prefabs.CherryPiePrefab;
import dhbw.teamgold.game.minigames.prefabs.FoodCoverPrefab;
import dhbw.teamgold.game.minigames.prefabs.GameCountdownDisplayPrefab;
import dhbw.teamgold.game.minigames.prefabs.PiePrefab;
import dhbw.teamgold.game.pausemenu.prefabs.LivesPrefab;

public class Minigame2Scene extends Scene {

	private List<Rectangle> pieAreas = new LinkedList<>();
	private List<Rectangle> coverAreas = new LinkedList<>();
	private List<Integer> indices = new LinkedList<>();

	public Minigame2Scene() {
		super(SceneIds.GAME_2);

		initPieAreas();
		initCoverAreas();
		initIndices();
	}

	private void initPieAreas() {
		pieAreas.add(new Rectangle(0.047f, 0.68f, 0.15f, 0.15f));
		pieAreas.add(new Rectangle(0.43f, 0.68f, 0.15f, 0.15f));
		pieAreas.add(new Rectangle(0.77f, 0.68f, 0.15f, 0.15f));
	}

	private void initCoverAreas() {
		coverAreas.add(new Rectangle(0.02f, 0.56f, 0.25f, 0.3f));
		coverAreas.add(new Rectangle(0.38f, 0.56f, 0.25f, 0.3f));
		coverAreas.add(new Rectangle(0.74f, 0.56f, 0.25f, 0.3f));
	}

	private void initIndices() {
		indices.add(0);
		indices.add(1);
		indices.add(2);
	}

	@Override
	protected void initializeGameObjects() {
		Collections.shuffle(indices);
		
		this.addGameObject(new PiePrefab(pieAreas.get(indices.get(0))));
		this.addGameObject(new FoodCoverPrefab(OnClickAction.LOSE, coverAreas.get(indices.get(0))));
		this.addGameObject(new ApplePiePrefab(pieAreas.get(indices.get(1))));
		this.addGameObject(new FoodCoverPrefab(OnClickAction.WIN, coverAreas.get(indices.get(1))));
		this.addGameObject(new CherryPiePrefab(pieAreas.get(indices.get(2))));
		this.addGameObject(new FoodCoverPrefab(OnClickAction.LOSE, coverAreas.get(indices.get(2))));
		this.addGameObject(new BackgroundImagePrefab("res/img/game2-background.png"));
		this.addGameObject(new ScoreDisplayPrefab());
		this.addGameObject(new LivesPrefab());
		this.addGameObject(new GameCountdownDisplayPrefab(8, 0.2f));
	}
}
