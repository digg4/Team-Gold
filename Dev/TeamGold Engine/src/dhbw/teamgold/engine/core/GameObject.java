package dhbw.teamgold.engine.core;

import java.util.function.Consumer;

import dhbw.teamgold.engine.core.exception.DuplicatedComponentException;
import dhbw.teamgold.engine.core.exception.NoSuchComponentException;

/**
 * A GameObject is the basic entity in every state of the game. <br/>
 * <i>Note that you should not manually implement this interface but define
 * behavior and data by adding Components to existing GameObjects.</i>
 * 
 * @author Daniel Spaniol
 */
public interface GameObject {

	/**
	 * Adds a Component to <code>this</code>. <br/>
	 * <i>Note that every GameObject might only have at most one instance of
	 * every kind of Component</i>
	 * 
	 * @param component
	 *            The Component to add. It specifies some data and/or behavior
	 *            for this GameObject.
	 * @throws DuplicatedComponentException
	 *             Thrown when you try to add an instance of a Component but
	 *             there already is a Component of that type attached to
	 *             <code>this</code>.
	 */
	void addComponent(Component component) throws DuplicatedComponentException;

	/**
	 * Executes the given function on every Component that is attached to
	 * <code>this</code>.
	 * 
	 * @param consumer
	 *            The function to execute on every Component.
	 */
	void forEachComponent(Consumer<Component> consumer);

	/**
	 * Returns the instance of that specific ComponentType. This is particular
	 * useful when one of the Components attached to <code>this</code> needs
	 * access to another component. <br/>
	 * <i>Note that you should always check if <code>this</code> has a Component
	 * of that type</i>
	 * 
	 * @param type
	 *            The Components type.
	 * @return The instances of that ComponentType attached to <code>this</code>
	 *         .
	 * @throws NoSuchComponentException
	 *             Thrown when you try to get a Component which is not attached
	 *             to <code>this</code>.
	 */
	<ComponentType extends Component> ComponentType getComponent(Class<ComponentType> type)
			throws NoSuchComponentException;

	/**
	 * Indicates whether or not <code>this</code> has a Component of the given
	 * type. This is particular useful to not get any unexpected
	 * {@link NoSuchComponentException}.
	 * 
	 * @param type
	 *            The type of Component to check.
	 * @return <code>true</code> when <code>this</code> has an instance of that
	 *         type, <code>false</code> otherwise.
	 */
	boolean hasComponent(Class<? extends Component> type);

	/**
	 * @param scene
	 *            The scene <code>this</code> is in.
	 */
	void setScene(Scene scene);

	/**
	 * Returns the Scene <code>this</code> is in. This is useful when you need
	 * to switch Scenes.
	 * 
	 * @return The Scene <code>this</code> is in.
	 */
	Scene getScene();

}
