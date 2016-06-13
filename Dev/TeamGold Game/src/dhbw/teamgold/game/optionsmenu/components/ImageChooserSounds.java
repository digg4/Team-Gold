package dhbw.teamgold.game.optionsmenu.components;

import org.newdawn.slick.Graphics;

import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.components.ImageComponent;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;
import dhbw.teamgold.engine.service.Services;
import dhbw.teamgold.game.common.services.GameStatsService;

public class ImageChooserSounds extends Component{
	@Require 
	private ImageComponent image;
	//Service f�rn sound suchen und dann jenachdem das jeweils andere Bild suchen
	boolean sounds = false;
	@Override
	public void onRenderGui(RenderArguments arguments) {
		if(sounds == false){
			image.setImage("ExitHell.png");
		}
		else{
			image.setImage("");
		}
	}
}
