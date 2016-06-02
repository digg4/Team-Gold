package dhbw.teamgold.engine.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation that states that a specific Component is Required for this
 * Component to work. For example: Assume we have a LocationComponent, an
 * ImageComponent and an ImageRendererComponent. In order to work the
 * ImageRendererComponent need the location and the image, these are saved in
 * their Component. With this annotation you can simply request them like this:
 * 
 * <pre>
 * 	public class ImageRendererComponent {
 * 		
 * 		&#64;Require
 * 		private ImageComponent imageComponent;
 * 
 * 		&#64;Require
 * 		private LocationComponent locationComponent;
 * 
 * 		&#64;Override
 * 		public void onRender(RenderArguments arguments) {
 * 			float x = locationComponent.getX();
 * 			float y = locationComponent.getY();
 * 			Image img = imageComponent.getImage();
 * 
 * 			arguments.getGraphics().drawImage(image, x, y);
 * 		}		
 * 	}
 * <pre>
 * 
 * @author Daniel Spaniol
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Require {
}
