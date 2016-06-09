package dhbw.teamgold.engine.components;

import org.newdawn.slick.Color;
import org.newdawn.slick.Font;
import org.newdawn.slick.Graphics;

import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.core.Component;
import dhbw.teamgold.engine.core.Require;

public class TextRendererComponent extends Component {

	@Require
	private AreaComponent area;

	@Require
	private TextComponent text;

	private Color textColor;
	private Font font;

	private TextAlign verticalAlign = TextAlign.MIDDLE;
	private TextAlign horizontalAlign = TextAlign.MIDDLE;

	public void setTextColor(Color textColor) {
		this.textColor = textColor;
	}

	public void setFont(Font font) {
		this.font = font;
	}

	public void setVerticalAlign(TextAlign verticalAlign) {
		this.verticalAlign = verticalAlign;
	}

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
	
	private float getTextX(Font font) {
		float areaX = area.getAbsoluteArea().getX();
		float areaWidth = area.getAbsoluteArea().getWidth();
		float textWidth = font.getWidth(text.getText());
		
		if (horizontalAlign == TextAlign.MIDDLE) {
			return areaX + ((areaWidth - textWidth) / 2);
		}
		
		return areaX + (horizontalAlign == TextAlign.END ? areaWidth - textWidth : 0);
	}
	
	private float getTextY(Font font) {
		float areaY = area.getAbsoluteArea().getY();
		float areaHeight = area.getAbsoluteArea().getHeight();
		float textHeight = font.getHeight(text.getText());
		
		if (verticalAlign == TextAlign.MIDDLE) {
			return areaY + ((areaHeight - textHeight) / 2);
		}
		
		return areaY + (verticalAlign == TextAlign.END ? areaHeight - textHeight : 0);
	}

	public static enum TextAlign {
		START, MIDDLE, END
	}

}
