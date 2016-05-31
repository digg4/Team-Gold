package dhbw.teamgold.engine.core;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Point;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import dhbw.teamgold.engine.behavior.MouseButtonArguments;
import dhbw.teamgold.engine.behavior.MouseMoveArguments;
import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.behavior.UpdateArguments;
import dhbw.teamgold.engine.behavior.services.BehaviorArgumentService;
import dhbw.teamgold.engine.core.services.GameObjectService;
import dhbw.teamgold.engine.service.Services;

/**
 * Every GameState should be implemented as a Scene. <br/>
 * Scene have the advantage that they support GameObjects which means you will
 * end up with less code-duplication. <br/>
 * You use Scenes like normal GameStates but instead of defining data and
 * overriding the GameState-methods you add GameObjects to the Scene which will
 * do all the work. <br/>
 * <br/>
 * <i>Note that you are no longer allowed to override the init, render and
 * update methods since you should use GameObjects</i>.
 * 
 * @author Daniel Spaniol
 */
public abstract class Scene extends BasicGameState {

	private static BehaviorArgumentService behaviorArgumentService;
	private static GameObjectService gameObjectService;

	private static void staticInjectServices() {
		if (behaviorArgumentService == null) {
			behaviorArgumentService = Services.get(BehaviorArgumentService.class);
		}

		if (gameObjectService == null) {
			gameObjectService = Services.get(GameObjectService.class);
		}
	}

	private List<GameObject> gameObjects = new LinkedList<>();
	private StateBasedGame game;
	private final int id;

	/**
	 * Creates a new Scene with the given ID. <br/>
	 * <i>Do not use the constructor to add GameObjects</i>!
	 * 
	 * @param id
	 *            The ID of this Scene.
	 */
	public Scene(int id) {
		this.id = id;

		staticInjectServices();
	}

	/**
	 * Helper method to easily execute a method on all Components of all
	 * GameObjects.
	 * 
	 * @param consumer
	 *            The function to call on every Component.
	 */
	private void forEachComponent(Consumer<Component> consumer) {
		gameObjects.forEach(gameObject -> gameObject.forEachComponent(consumer));
	}

	@Override
	public final void init(GameContainer container, StateBasedGame game) throws SlickException {
		this.game = game;

		gameObjects.clear();
		initializeGameObjects();
	}

	@Override
	public final void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
		RenderArguments arguments = behaviorArgumentService.createRenderArguments(g);

		forEachComponent(component -> component.onRenderBackground(arguments));
		forEachComponent(component -> component.onRender(arguments));
		forEachComponent(component -> component.onRenderGui(arguments));
	}

	@Override
	public final void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
		UpdateArguments arguments = behaviorArgumentService.createUpdateArguments();

		forEachComponent(component -> component.onUpdate(arguments));
	}

	@Override
	public int getID() {
		return id;
	}

	/**
	 * 
	 * Adds a GameObject to this Scene. It calls the
	 * <code>initializeGameObject</code>-methods of the Components of that
	 * GameObject.
	 * 
	 * @param object
	 *            The GameObject to add.
	 */
	public void addGameObject(GameObject object) {
		gameObjects.add(object);
		object.setScene(this);

		object.forEachComponent(component -> {
			component.onInitializeGameObject(behaviorArgumentService.createInitializeArguments());
		});
	}

	/**
	 * Creates a GameObjects based on the Prefab and adds it to this Scene
	 * afterwards.
	 * 
	 * @param prefab
	 *            The Prefab describing the pre-defined GameObject.
	 */
	public void addGameObject(Prefab prefab) {
		this.addGameObject(createGameObject(prefab));
	}

	/**
	 * Creates a new GameObject
	 * 
	 * @param prefab
	 *            Prefab defining the GameObject
	 * @return The new GameObject
	 */
	public GameObject createGameObject(Prefab prefab) {
		return gameObjectService.createGameObject(prefab);
	}

	/**
	 * Lets the game enter another GameState.
	 * 
	 * @param id
	 *            The ID of the Scene to enter.
	 */
	public void switchScene(int id) {
		game.enterState(id);
	}

	/**
	 * @return The width of the game canvas.
	 */
	public int getSceneWidth() {
		return game.getContainer().getWidth();
	}

	/**
	 * @return The height of the game canvas.
	 */
	public int getSceneHeight() {
		return game.getContainer().getHeight();
	}

	@Override
	public void mousePressed(int button, int x, int y) {
		MouseButtonArguments arguments = behaviorArgumentService.createMouseButtonArguments(new Point(x, y), button);

		forEachComponent(component -> component.onMouseButtonPressed(arguments));
	}

	@Override
	public void mouseReleased(int button, int x, int y) {
		MouseButtonArguments arguments = behaviorArgumentService.createMouseButtonArguments(new Point(x, y), button);

		forEachComponent(component -> component.onMouseButtonRelease(arguments));
	}

	@Override
	public void mouseMoved(int oldx, int oldy, int newx, int newy) {
		Point from = new Point(oldx, oldy);
		Point to = new Point(newx, newy);
		MouseMoveArguments arguments = behaviorArgumentService.createMouseMoveArguments(from, to);

		forEachComponent(component -> component.onMouseMove(arguments));
	}

	/**
	 * Method to be called on initializing this Scene. In here you should add
	 * all GameObjects.
	 */
	protected abstract void initializeGameObjects();

}
