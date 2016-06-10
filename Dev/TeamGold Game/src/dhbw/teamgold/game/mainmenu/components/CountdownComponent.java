package dhbw.teamgold.game.mainmenu.components;

import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.core.Component;



public class CountdownComponent extends Component{
	private static final Runnable DO_NOTHING = () ->{};
	private float secondsLeft = 900;
	private boolean done = false;
	private Runnable callback = DO_NOTHING;
	
	public void onEnd(Runnable callback){
		if(callback == null){
			callback = DO_NOTHING;
		}
		this.callback = callback;
	}
	
	public float getPercentDone(){
		return Math.min(1, 1-secondsLeft/900);
	}
	@Override
	public void onUpdate(UpdateArguments args){
		if(secondsLeft > 0){
				secondsLeft-=args.getSecondsSinceLastUpdate();
		}
		if(secondsLeft <= 0 && !done){
			callback.run();
			done = true;
		}
	}
}
