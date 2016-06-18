package dhbw.teamgold.game.minigames.prefabs;

import java.util.Map;
import java.util.TreeMap;

import org.newdawn.slick.geom.Point;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.Messages;
import dhbw.teamgold.game.SceneIds;
import dhbw.teamgold.game.minigames.components.GameInfoTextData;
import dhbw.teamgold.game.minigames.components.GameInfoTextRenderer;

public class GameInfoTextDisplayPrefab extends PrototypedPrefab {
	
	private static Map<Integer, String> gameInfoTexts = new TreeMap<>();
	private static Map<Integer, Point> gameInfoLocations = new TreeMap<>();

	static {
		mapInfoTexts();
		mapInfoLocations();
	}
	
	private static void mapInfoTexts() {
		gameInfoTexts.put(SceneIds.GAME_1, Messages.getString("GameInfos.WaterTapGame"));
		gameInfoTexts.put(SceneIds.GAME_2, Messages.getString("GameInfos.ApplePieGame"));
		gameInfoTexts.put(SceneIds.GAME_3, Messages.getString("GameInfos.BeamerGame"));
		gameInfoTexts.put(SceneIds.GAME_4, Messages.getString("GameInfos.LitterGame"));
		gameInfoTexts.put(SceneIds.GAME_5, Messages.getString("GameInfos.TrainGetterGame"));
	}
	
	private static void mapInfoLocations() {
		gameInfoLocations.put(SceneIds.GAME_1, new Point(0.1f, 0.1f));
		gameInfoLocations.put(SceneIds.GAME_2, new Point(0.1f, 0.1f));
		gameInfoLocations.put(SceneIds.GAME_3, new Point(0.1f, 0.1f));
		gameInfoLocations.put(SceneIds.GAME_4, new Point(0.1f, 0.1f));
		gameInfoLocations.put(SceneIds.GAME_5, new Point(0.1f, 0.1f));
	}
	
	private final String infoText;
	private final Point infoLocation;
	
	public GameInfoTextDisplayPrefab(int gameId) {
		infoText = gameInfoTexts.get(gameId);
		infoLocation = gameInfoLocations.get(gameId);
	}
	
	@Override
	protected void initializeGameObject(GameObject object) {
		object.addComponent(new GameInfoTextData(infoText, infoLocation.getX(), infoLocation.getY()));
		object.addComponent(new GameInfoTextRenderer());
	}

}
