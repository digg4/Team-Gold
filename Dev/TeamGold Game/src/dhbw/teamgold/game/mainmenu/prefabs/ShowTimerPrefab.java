package dhbw.teamgold.game.mainmenu.prefabs;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;

import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.components.ImageRendererComponent;
import dhbw.teamgold.engine.components.TextComponent;
import dhbw.teamgold.engine.components.TextRendererComponent;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.Prefab;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.engine.core.services.GameObjectService;
import dhbw.teamgold.engine.service.Inject;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.GameStatsPersistenceService;
import dhbw.teamgold.game.common.services.GameTimeService;
import dhbw.teamgold.game.common.services.providers.GameTimeServiceProvider;
import dhbw.teamgold.game.mainmenu.components.CountdownComponent;
import dhbw.teamgold.game.mainmenu.components.CountdownRendererComponent;

public class ShowTimerPrefab extends PrototypedPrefab {
	@Override
	protected void initializeGameObject(GameObject object) {
		AreaComponent area = new AreaComponent(new Rectangle(0f, 0f, 1f, 0.02f));
		CountdownComponent countdown = new CountdownComponent();
		CountdownRendererComponent countdownRenderer = new CountdownRendererComponent(); 
		object.addComponent(area);
		object.addComponent(countdown);
		object.addComponent(countdownRenderer);
	}

}
