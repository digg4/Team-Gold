package dhbw.teamgold.game.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dhbw.teamgold.game.SceneIds;

/**
 * Implementation of MinigameChooserService. <br/>
 * It determines the next game to play by putting all possible game-IDs in a
 * list and randomizing the order of the list. After all games were played once
 * it will randomize the list once again and checking that the new first game to
 * play is not the last game you just played. This guarantees that after 5 games
 * every game will be played exactly once and no game will be played twice in a
 * row.
 * 
 * @author Daniel Spaniol
 */
public class MinigameChooserServiceImpl implements MinigameChooserService {

	/**
	 * The IDs of the mini-games in the order they will be played.
	 */
	private List<Integer> minigameIds = new ArrayList<>();
	/**
	 * The list-index of the current mini-game to play.
	 */
	private int currentIndex = 0;

	/**
	 * Loads up all mini-games and shuffles them for the forst time so that the
	 * first round to play will already have a random order.
	 */
	public MinigameChooserServiceImpl() {
		loadMinigameIds();
		shuffleMinigameIds();
	}

	/**
	 * Load all IDs of the mini-games into the ID-list. <br/>
	 * <i>Note that they will still be in order afterwards.</i>
	 */
	private void loadMinigameIds() {
		for (int id : SceneIds.GAMES) {
			minigameIds.add(id);
		}
	}

	/**
	 * Brings the mini-games to a random order. This will also ensures that no
	 * mini-game will be played twice in a row.
	 */
	private void shuffleMinigameIds() {
		int oldLast = minigameIds.get(minigameIds.size() - 1);
		int newFirst;

		do {
			Collections.shuffle(minigameIds);

			newFirst = minigameIds.get(0);
		} while (oldLast == newFirst);
	}

	@Override
	public int getNextMinigameId() {
		int id = minigameIds.get(currentIndex);

		currentIndex++;
		if (currentIndex == minigameIds.size()) {
			currentIndex = 0;
			shuffleMinigameIds();
		}

		return id;
	}

	@Override
	public int getCurrentMinigameId() {
		return minigameIds.get(currentIndex);
	}
}
