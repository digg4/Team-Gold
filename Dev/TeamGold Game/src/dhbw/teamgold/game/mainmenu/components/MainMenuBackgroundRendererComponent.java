package dhbw.teamgold.game.mainmenu.components;
import dhbw.teamgold.engine.behavior.InitializeArguments;
import dhbw.teamgold.engine.behavior.RenderArguments;
import dhbw.teamgold.engine.core.Component;


public class MainMenuBackgroundRendererComponent extends Component {

	private int width;
	private int height;

	@Override
	public void onInitializeGameObject(InitializeArguments arguments) {
		width = getGameObject().getScene().getSceneWidth();
		height = getGameObject().getScene().getSceneHeight();
		
		
	}

	@Override
	public void onRender(RenderArguments arguments) {
		
		}
	}
