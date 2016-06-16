package dhbw.teamgold.game.minigames;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.core.Scene;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.common.prefabs.BackgroundImagePrefab;
import dhbw.teamgold.game.common.prefabs.ScoreDisplayPrefab;
import dhbw.teamgold.game.minigames.prefabs.ApplePiePrefab;
import dhbw.teamgold.game.minigames.prefabs.CherryPiePrefab;
import dhbw.teamgold.game.minigames.prefabs.PiePrefab;
import dhbw.teamgold.game.pausemenu.prefabs.LivesPrefab;

public class Minigame2Scene extends Scene {

	private List<Rectangle> pieAreas = new LinkedList<>();
	
	public Minigame2Scene() {
		super(SceneIds.GAME_2);

		pieAreas.add(new Rectangle(0.047f, 0.68f, 0.15f, 0.15f));
		pieAreas.add(new Rectangle(0.43f, 0.68f, 0.15f, 0.15f));
		pieAreas.add(new Rectangle(0.77f, 0.68f, 0.15f, 0.15f));
	}
	
	private void randomizePies() {
		Collections.shuffle(pieAreas);
	}

	@Override
	protected void initializeGameObjects() {
		randomizePies();
		
		this.addGameObject(new PiePrefab(pieAreas.get(0)));
		this.addGameObject(new ApplePiePrefab(pieAreas.get(1)));
		this.addGameObject(new CherryPiePrefab(pieAreas.get(2)));
		this.addGameObject(new BackgroundImagePrefab("res/img/game2-background.png"));
		this.addGameObject(new ScoreDisplayPrefab());
		this.addGameObject(new LivesPrefab());
	}
}
