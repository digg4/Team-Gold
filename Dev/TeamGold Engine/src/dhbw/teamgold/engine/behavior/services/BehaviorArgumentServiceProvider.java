package dhbw.teamgold.engine.behavior.services;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Point;

import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.behavior.InitializeArgumentsImpl;
import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.behavior.MouseButtonArgumentsImpl;
import dhbw.teamgold.engine.behavior.MouseMoveArguments;
import dhbw.teamgold.engine.behavior.MouseMoveArgumentsImpl;
import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.behavior.RenderArgumentsImpl;
import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.behavior.UpdateArgumentsImpl;
import dhbw.teamgold.engine.service.Provider;

/**
 * Creates a new BehaviorArgumentService.
 * 
 * @author Daniel Spaniol
 */
public class BehaviorArgumentServiceProvider implements Provider<BehaviorArgumentService> {

	@Override
	public BehaviorArgumentService createService() {
		return new BehaviorArgumentServiceImpl();
	}

	@Override
	public Class<BehaviorArgumentService> getType() {
		return BehaviorArgumentService.class;
	}
	
	/**
	 * Implementation of BehaviorArgumentService.
	 * <br/>
	 * <i>It instantiates all the arguments only once for better performance and
	 * just sets their field-values in the methods. This might be problematical
	 * since its not thread-save at all. But since their interfaces have no setters
	 * and our application will be single-threaded we can ignore that.</i>
	 * 
	 * @author Daniel Spaniol
	 */
	private static class BehaviorArgumentServiceImpl implements BehaviorArgumentService {

		private InitializeArgumentsImpl initializeArguments = new InitializeArgumentsImpl();
		private RenderArgumentsImpl renderArguments = new RenderArgumentsImpl();
		private UpdateArgumentsImpl updateArguments = new UpdateArgumentsImpl();
		private MouseMoveArgumentsImpl mouseMoveArguments = new MouseMoveArgumentsImpl();
		private MouseButtonArgumentsImpl mouseButtonArguments = new MouseButtonArgumentsImpl();

		private long lastUpdateTimestamp = System.nanoTime();

		@Override
		public InitializeArguments createInitializeArguments() {
			return initializeArguments;
		}

		@Override
		public RenderArguments createRenderArguments(Graphics graphics) {
			renderArguments.setGraphics(graphics);
			return renderArguments;
		}

		@Override
		public UpdateArguments createUpdateArguments() {
			double secondsSincelastUpdate = (System.nanoTime() - lastUpdateTimestamp) / 1e9;
			lastUpdateTimestamp = System.nanoTime();

			updateArguments.setSecondsSinceLastUpdate(secondsSincelastUpdate);
			return updateArguments;
		}
		
		@Override
		public MouseMoveArguments createMouseMoveArguments(Point from, Point to) {
			mouseMoveArguments.setOldLocation(from);
			mouseMoveArguments.setNewLocation(to);
			
			return mouseMoveArguments;
		}
		
		@Override
		public MouseButtonArguments createMouseButtonArguments(Point where, int buttonCode) {
			mouseButtonArguments.setButtonCode(buttonCode);
			mouseButtonArguments.setLocation(where);
			
			return mouseButtonArguments;
		}
	}
}
