package dhbw.teamgold.game.common.services.providers;

import java.util.Random;

import dhbw.teamgold.engine.service.Provider;
import dhbw.teamgold.game.common.services.WinLoseTextService;

public class WinLoseTextServiceProvider implements Provider<WinLoseTextService> {

	@Override
	public WinLoseTextService createService() {
		return new WinLoseTextServiceImpl();
	}

	@Override
	public Class<WinLoseTextService> getType() {
		return WinLoseTextService.class;
	}

	private static class WinLoseTextServiceImpl implements WinLoseTextService {

		private static Random random = new Random();
		
		private static final String[] LOSE_TEXTS = {
				"Rekt", "Pwned", "N00b", "Git gud", "Lost", "U even trying?"
		};
		
		private String currentText = "";
		
		@Override
		public String getCurrentText() {
			return currentText;
		}

		@Override
		public void loadNextWinText() {
			currentText = "Win";
		}

		@Override
		public void loadNextLoseText() {
			currentText = LOSE_TEXTS[random.nextInt(LOSE_TEXTS.length)];
		}
		
	}
	
}
