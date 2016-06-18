package dhbw.teamgold.game.minigames.prefabs;

import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.PrototypedPrefab;
import dhbw.teamgold.game.minigames.components.TrafficLightClickHandler;
import dhbw.teamgold.game.minigames.components.TrafficLightController;
import dhbw.teamgold.game.minigames.components.TrafficLightTimer;

public class TrafficLightControllerPrefab extends PrototypedPrefab {

	private GameObject farTrafficLight;
	private GameObject nearTrafficLight;
	
	public TrafficLightControllerPrefab(GameObject farLight, GameObject nearLight) {
		farTrafficLight = farLight;
		nearTrafficLight = nearLight;
	}
	
	@Override
	protected void initializeGameObject(GameObject object) {
		TrafficLightTimer trafficLightTimer = new TrafficLightTimer(1f, 2f);
		TrafficLightController controller = new TrafficLightController();
		TrafficLightClickHandler clickHandler = new TrafficLightClickHandler();
		
		controller.setFarTrafficLight(farTrafficLight);
		controller.setNearTrafficLight(nearTrafficLight);
		
		object.addComponent(trafficLightTimer);
		object.addComponent(controller);
		object.addComponent(clickHandler);
	}

}
