package dhbw.teamgold.game.mainmenu.components;

import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class OptionsButtonClickHandler extends Component {

	@Require
	private AreaComponent areaComponent;
	
	@Override
	public void onMouseButtonPressed(MouseButtonArguments arguments) {
		float x = arguments.getX();
		float y = arguments.getY();
		
		if (areaComponent.contains(x, y)) {
			System.out.println("Entering Options Menu");
		}
	}

}
