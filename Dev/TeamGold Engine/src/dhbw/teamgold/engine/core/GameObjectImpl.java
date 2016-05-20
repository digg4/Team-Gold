package dhbw.teamgold.engine.core;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import dhbw.teamgold.engine.core.exception.DuplicatedComponentException;
import dhbw.teamgold.engine.core.exception.NoSuchComponentException;

/**
 * Implementation of GameObject. <br/>
 * <i>Note that you should never instantiate this class by your own. Always get
 * your GameObjects through the GameObjectService</i>.
 * 
 * @author Daniel Spaniol
 *
 */
public class GameObjectImpl implements GameObject {

	private Map<Class<?>, Component> components = new HashMap<>();
	private Scene containingScene;

	@Override
	public void addComponent(Component component) throws DuplicatedComponentException {
		Class<? extends Component> type = component.getClass();

		if (components.containsKey(type)) {
			throw new DuplicatedComponentException(type);
		}

		components.put(type, component);
		component.setGameObject(this);
	}

	@Override
	public void forEachComponent(Consumer<Component> consumer) {
		components.values().stream().forEach(consumer);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <ComponentType extends Component> ComponentType getComponent(Class<ComponentType> type)
			throws NoSuchComponentException {
		if (!hasComponent(type)) {
			throw new NoSuchComponentException(type);
		}
		
		return (ComponentType) components.get(type);
	}

	@Override
	public boolean hasComponent(Class<? extends Component> type) {
		return components.containsKey(type);
	}

	@Override
	public void setScene(Scene scene) {
		containingScene = scene;
	}

	@Override
	public Scene getScene() {
		return containingScene;
	}

}
