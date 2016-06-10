package dhbw.teamgold.game.mainmenu.prefabs;

import org.newdawn.slick.Color;
import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent.RenderLayer;
import dhbw.teamgold.engine.components.TextComponent;
import dhbw.teamgold.engine.components.TextRendererComponent;
import dhbw.teamgold.engine.components.TextRendererComponent.TextAlign;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.Prefab;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.engine.core.services.GameObjectService;
import dhbw.teamgold.engine.service.Services;

public class HighscorePrefab extends PrototypedPrefab {
		
		@Override
		protected void initializeGameObject(GameObject object) {
			
			AreaComponent area = new AreaComponent(new Rectangle(0.75f,0.75f,0.25f,0.1f));
			TextComponent text = new TextComponent("HIGHSCORE\n"+"No Highscore available");
			TextRendererComponent textRendererComponent = new TextRendererComponent();
			object.addComponent(area);
			object.addComponent(text);
			object.addComponent(textRendererComponent);
			
		}
		
		
	

}
