package dhbw.teamgold.game.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dhbw.teamgold.game.SceneIds;

public class MinigameChooserServiceImpl implements MinigameChooserService {

	private List<Integer> minigameIds = new ArrayList<>();
	private int currentIndex = 0;
	
	public MinigameChooserServiceImpl() {
		loadMinigameIds();
		shuffleMinigameIds();
	}
	
	private void loadMinigameIds() {
		for (int id : SceneIds.GAMES) {
			minigameIds.add(id);
		}
	}

	private void shuffleMinigameIds() {
		int oldLast = minigameIds.get(minigameIds.size() - 1);
		int newFirst;
		
		do {
			Collections.shuffle(minigameIds);
			
			newFirst = minigameIds.get(0);
		} while(oldLast == newFirst);
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
}
