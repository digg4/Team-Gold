package dhbw.teamgold.engine.components;

import org.newdawn.slick.Color;
import org.newdawn.slick.Font;
import org.newdawn.slick.Graphics;

import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

/**
 * Component that saves the text provided by the TextComponent at the area
 * provided by the AreaComponent.
 * 
 * @author Daniel Spaniol
 */
public class TextRendererComponent extends Component {

	@Require
	private AreaComponent area;

	@Require
	private TextComponent text;

	/**
	 * Color in which the text is rendered. Null if this Component should not
	 * alter the Color.
	 */
	private Color textColor;
	/**
	 * Font that is used to draw the text. Null if this Component should not
	 * alter the Font.
	 */
	private Font font;
	/**
	 * Vertical alignment of the text.
	 */
	private TextAlign verticalAlign = TextAlign.MIDDLE;
	/**
	 * Horizontal alignment of the text.
	 */
	private TextAlign horizontalAlign = TextAlign.MIDDLE;

	/**
	 * @param textColor
	 *            The Color to draw the text in. Null if the Color should not be
	 *            altered.
	 */
	public void setTextColor(Color textColor) {
		this.textColor = textColor;
	}

	/**
	 * @param font
	 *            The Font to draw the text in. Null if the Font should not be
	 *            altered.
	 */
	public void setFont(Font font) {
		this.font = font;
	}

	/**
	 * @param verticalAlign
	 *            The vertical alignment of the text.
	 *            <ul>
	 *            <li>START: the text starts at the left boundary</li>
	 *            <li>MIDDLE: the text is centered</li>
	 *            <li>END: the text ends at the right boundary</li>
	 *            </ul>
	 */
	public void setVerticalAlign(TextAlign verticalAlign) {
		this.verticalAlign = verticalAlign;
	}

	/**
	 * @param horizontalAlign
	 *            The horizontal alignment of the text.
	 *            <ul>
	 *            <li>START: the text starts at the upper boundary</li>
	 *            <li>MIDDLE: the text is centered</li>
	 *            <li>END: the text ends at the lower boundary</li>
	 *            </ul>
	 */
	public void setHorizontalAlign(TextAlign horizontalAlign) {
		this.horizontalAlign = horizontalAlign;
	}

	@Override
	public void onRenderGui(RenderArguments arguments) {
		Graphics g = arguments.getGraphics();

		if (font != null) {
			g.setFont(font);
		}

		if (textColor != null) {
			g.setColor(textColor);
		}

		Font font = g.getFont();
		float textX = getTextX(font);
		float textY = getTextY(font);

		g.drawString(text.getText(), textX, textY);
	}

	/**
	 * Calculates the x-coordinate the text should be rendered at according to
	 * the horizontal alignment and the font-size.
	 * 
	 * @param font
	 *            The font used to draw the text
	 * @return The x-coordinate to draw the text at.
	 */
	private float getTextX(Font font) {
		float areaX = area.getAbsoluteArea().getX();
		float areaWidth = area.getAbsoluteArea().getWidth();
		float textWidth = font.getWidth(text.getText());

		if (horizontalAlign == TextAlign.MIDDLE) {
			return areaX + ((areaWidth - textWidth) / 2);
		}

		return areaX + (horizontalAlign == TextAlign.END ? areaWidth - textWidth : 0);
	}

	/**
	 * Calculates the y-coordinate the text should be rendered at according to
	 * the vertical alignment and the font-size.
	 * 
	 * @param font
	 *            The font used to draw the text
	 * @return The y-coordinate to draw the text at.
	 */
	private float getTextY(Font font) {
		float areaY = area.getAbsoluteArea().getY();
		float areaHeight = area.getAbsoluteArea().getHeight();
		float textHeight = font.getHeight(text.getText());

		if (verticalAlign == TextAlign.MIDDLE) {
			return areaY + ((areaHeight - textHeight) / 2);
		}

		return areaY + (verticalAlign == TextAlign.END ? areaHeight - textHeight : 0);
	}

	/**
	 * Describes where in the boundaries provided by the AreaComponent the text
	 * should be drawn.
	 * 
	 * @author Daniel Spaniol
	 */
	public static enum TextAlign {
		START, MIDDLE, END
	}
}
