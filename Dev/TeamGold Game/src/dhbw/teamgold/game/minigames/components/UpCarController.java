package dhbw.teamgold.game.minigames.components;

import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class UpCarController extends Component {

	@Require
	private AreaComponent areaComponent;
	
	private float xSpeed = 600f;
	private float ySpeed = -45f;
	
	@Override
	public void onUpdate(UpdateArguments arguments) {
		float x = areaComponent.getAbsoluteArea().getX();
		float y = areaComponent.getAbsoluteArea().getY();
		double time = arguments.getSecondsSinceLastUpdate();
		
		x += xSpeed * time;
		y += ySpeed * time;
		
		areaComponent.getAbsoluteArea().setLocation(x, y);
	}
	
}
