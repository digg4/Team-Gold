package dhbw.teamgold.game.optionsmenu.components;

import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.components.AreaComponent;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class ImageChooserSounds extends Component{
	@Require
	AreaComponent area;
	@Require 
	private ImageComponent image;
	boolean sounds = true;
	public ImageChooserSounds(boolean change) {
		sounds = change;
	}
	
	@Override
	public void onRenderGui(RenderArguments arguments) {
		if(sounds){
			image.setImage("res/gui/SchalterOn.png");
		}else{
			image.setImage("res/gui/SchalterOff.png");}
		
		
	}
}
