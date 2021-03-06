package dhbw.teamgold.game.minigames.components;

import org.newdawn.slick.Color;

import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.GameStatsService;

public class CableDifficultyAdapter extends Component {

	private GameStatsService statsService = Services.get(GameStatsService.class);
	
	public void adaptDifficulty(CableDataComponent data) {
		if (data.getColor() == Color.red && statsService.getStats().getDifficulty() <= 5) {
			data.setFinished(true);
		}
		
		if (data.getColor() == Color.yellow && statsService.getStats().getDifficulty() <= 10) {
			data.setFinished(true);
		}
		if (data.getColor() == Color.green && statsService.getStats().getDifficulty() <= 15) {
			data.setFinished(true);
		}
	}
}
