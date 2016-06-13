package dhbw.teamgold.game.statsscreen.prefabs;



import org.newdawn.slick.Color;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.TextComponent;
import dhbw.teamgold.engine.components.TextRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.GameStatsService;


public class PointsStatsPrefab extends PrototypedPrefab {
	GameStatsService gameStatsService = Services.get(GameStatsService.class);
	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(0.34f, 0.6f, 0.3f, 0.15f);
		TextComponent text = new TextComponent();
		text.setText("Points:  " + gameStatsService.getStats().getScore());
		System.out.println(text.getText());
		TextRendererComponent renderer = new TextRendererComponent();
		renderer.setTextColor(Color.red);
		object.addComponent(area);
		object.addComponent(text);
		object.addComponent(renderer);
		}

	

}
