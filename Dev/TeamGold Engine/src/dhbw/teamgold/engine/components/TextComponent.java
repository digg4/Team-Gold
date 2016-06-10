package dhbw.teamgold.engine.components;

import dhbw.teamgold.engine.core.Component;

/**
 * This Component saves some text. This text can be rendered by the
 * TextRendererComponent.
 * 
 * @author Daniel Spaniol
 */
public class TextComponent extends Component {

	/**
	 * The text to save.
	 */
	private String text;

	/**
	 * Creates a new TextComponent that saves no text.
	 */
	public TextComponent() {
		this("");
	}

	/**
	 * Creates a new TextComponent that saves the given text.
	 * 
	 * @param text
	 *            The text to save.
	 */
	public TextComponent(String text) {
		setText(text);
	}

	/**
	 * @return The text this Component saves.
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text
	 *            The text saves.
	 */
	public void setText(String text) {
		this.text = text;
	}
}
