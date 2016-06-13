package dhbw.teamgold.game.optionsmenu.components;

import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class ImageChooserSounds extends Component{
	@Require 
	private ImageComponent image;
	//Service fürn sound suchen und dann jenachdem das jeweils andere Bild suchen
	boolean sounds = false;
	@Override
	public void onRenderGui(RenderArguments arguments) {
		if(sounds == false){
			image.setImage("res/gui/Button-Background.png");
		}
		else{
			image.setImage("");
		}
	}
}
