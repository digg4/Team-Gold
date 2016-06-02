package dhbw.teamgold.game;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 * The Game itself as provided by the Slick2D-engine. It is just a state-machine
 * that delegates the updating and rendering etc to its current state.
 * 
 * @author Daniel Spaniol
 */
public class _TeamGold_Game extends StateBasedGame {

	public _TeamGold_Game(String name) {
		super(name);
	}

	@Override
	public void initStatesList(GameContainer container) throws SlickException {
	}

}
