package dhbw.teamgold.game.common;

import java.io.Serializable;

/**
 * @author Daniel
 */
public class PersistentGameStats implements Serializable {

	/**
	 * UID 1: The first version of {@link PersistentGameStats} <br/>
	 * Contains:
	 * <ul>
	 * <li>int highscore</li>
	 * <li>long gameStart</li>
	 * </ul>
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The highest score a player has ever achieved
	 */
	private int highscore;

	/**
	 * TimeStamp to show when the game started. This is used if order to know
	 * whether or not the player still may play.
	 */
	private long gameStart;
	
	public int getHighscore() {
		return highscore;
	}

	public void setHighscore(int highscore) {
		this.highscore = highscore;
	}

	public long getGameStart() {
		return gameStart;
	}

	public void setGameStart(long gameStart) {
		this.gameStart = gameStart;
	}

}
