package dhbw.teamgold.game.common.prefabs;

import org.newdawn.slick.Color;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.TextComponent;
import dhbw.teamgold.engine.components.TextRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.GameStatsService;

public class ScoreDisplayPrefab extends PrototypedPrefab {

	private GameStatsService gameStatsService = Services.get(GameStatsService.class);

	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(0.75f, 0.02f, 0.2f, 0.05f);
		TextComponent text = new TextComponent();
		TextRendererComponent renderer = new TextRendererComponent();

		text.setText(String.valueOf(gameStatsService.getStats().getScore()));
		renderer.setTextColor(Color.black);

		object.addComponent(area);
		object.addComponent(text);
		object.addComponent(renderer);
	}
}
