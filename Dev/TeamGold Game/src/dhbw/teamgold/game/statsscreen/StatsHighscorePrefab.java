package dhbw.teamgold.game.statsscreen;

import org.newdawn.slick.Color;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.TextComponent;
import dhbw.teamgold.engine.components.TextRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.HighscoreService;


public class StatsHighscorePrefab extends PrototypedPrefab {
	private HighscoreService highscoreService = Services.get(HighscoreService.class);
	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(0.36f, 0.65f, 0.25f, 0.1f);
		TextComponent text = new TextComponent("Highscore: " + highscoreService.getHighscore());
		TextRendererComponent textRenderer = new TextRendererComponent();
		textRenderer.setTextColor(Color.red);
		object.addComponent(area);
		object.addComponent(text);
		object.addComponent(textRenderer);
	}
}
