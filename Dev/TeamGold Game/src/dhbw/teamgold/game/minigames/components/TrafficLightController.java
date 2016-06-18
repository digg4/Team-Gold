package dhbw.teamgold.game.minigames.components;

import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.GameObject;
import dhbw.teamgold.engine.core.Require;
import dhbw.teamgold.game.minigames.components.TrafficLightTimer.Phase;

public class TrafficLightController extends Component {

	@Require
	private TrafficLightTimer timer;
	
	private GameObject farTrafficLight;
	private GameObject nearTrafficLight;
	
	private Phase currentPhase;
	
	@Override
	public void onUpdate(UpdateArguments arguments) {
		if (phaseHasChanged()) {
			currentPhase = timer.getPhase();
			
			if (currentPhase == Phase.RED) {
				farTrafficLight.getComponent(ImageComponent.class).setImage("res/img/traffic-light-far-red.png");
				nearTrafficLight.getComponent(ImageComponent.class).setImage("res/img/traffic-light-near-red.png");
			} else {
				farTrafficLight.getComponent(ImageComponent.class).setImage("res/img/traffic-light-far-green.png");
				nearTrafficLight.getComponent(ImageComponent.class).setImage("res/img/traffic-light-near-green.png");
			}
		}
	}
	
	private boolean phaseHasChanged() {
		return timer.getPhase() != currentPhase;
	}
	
	public void setFarTrafficLight(GameObject farTrafficLight) {
		this.farTrafficLight = farTrafficLight;
	}
	
	public void setNearTrafficLight(GameObject nearTrafficLight) {
		this.nearTrafficLight = nearTrafficLight;
	}
	
}
