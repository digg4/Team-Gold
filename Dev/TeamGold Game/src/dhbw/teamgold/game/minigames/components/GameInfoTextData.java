package dhbw.teamgold.game.minigames.components;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.core.Component;

public class GameInfoTextData extends Component {

	private String text;
	private float relativeX;
	private float relativeY;
	private float absoluteX;
	private float absoluteY;
	
	public GameInfoTextData(String text, float relativeX, float relativeY) {
		this.text = text;
		this.relativeX = relativeX;
		this.relativeY = relativeY;
	}
	
	public float getAbsoluteX() {
		return absoluteX;
	}
	
	public float getAbsoluteY() {
		return absoluteY;
	}
	
	public String getText() {
		return text;
	}
	
	@Override
	public void onInitializeGameObject(InitializeArguments arguments) {
		absoluteX = relativeX * getGameObject().getScene().getSceneWidth();
		absoluteY = relativeY * getGameObject().getScene().getSceneHeight();
	}
	
}
