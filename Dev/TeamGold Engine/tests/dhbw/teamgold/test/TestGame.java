package dhbw.teamgold.test;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import dhbw.teamgold.engine.service.Services;

public class TestGame extends StateBasedGame {
	
	public static void main(String[] args) {
		Services.registerDefaultProviders();
		
		try {
			AppGameContainer game = new AppGameContainer(new TestGame("Test"));
			game.setDisplayMode(1280, 720, false);
//			game.setTargetFrameRate(60);
			game.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

	public TestGame(String name) {
		super(name);
	}

	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		this.addState(new BallScene());
		
		this.enterState(SceneIds.BALL_SCENE);
	}

}
