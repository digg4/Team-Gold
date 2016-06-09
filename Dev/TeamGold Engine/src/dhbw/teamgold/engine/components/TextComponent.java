package dhbw.teamgold.engine.components;

import dhbw.teamgold.engine.core.Component;

public class TextComponent extends Component {

	private String text;

	public TextComponent() {
		this("");
	}
	
	public TextComponent(String text) {
		setText(text);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
