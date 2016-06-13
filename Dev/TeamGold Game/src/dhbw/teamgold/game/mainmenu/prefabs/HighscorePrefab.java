package dhbw.teamgold.game.mainmenu.prefabs;

import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.TextComponent;
import dhbw.teamgold.engine.components.TextRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.HighscoreService;

public class HighscorePrefab extends PrototypedPrefab {
		HighscoreService highscoreService = Services.get(HighscoreService.class);
		@Override
		protected void initializeGameObject(GameObject object) {
			
			AreaComponent area = new AreaComponent(new Rectangle(0.75f,0.75f,0.25f,0.1f));
			TextComponent text = new TextComponent("HIGHSCORE\n"+highscoreService.getHighscore());
			TextRendererComponent textRendererComponent = new TextRendererComponent();
			object.addComponent(area);
			object.addComponent(text);
			object.addComponent(textRendererComponent);
			
		}
		
		
	

}
