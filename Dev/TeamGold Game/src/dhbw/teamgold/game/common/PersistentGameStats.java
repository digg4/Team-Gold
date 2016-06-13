package dhbw.teamgold.game.common;

import java.io.Serializable;

/**
 * The stats that will be saved when the game closes. This is a POJO.
 * 
 * @author Daniel Spaniol
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

	/**
	 * @return The highest score reached so far
	 */
	public int getHighscore() {
		return highscore;
	}

	/**
	 * @param highscore
	 *            The new highscore
	 */
	public void setHighscore(int highscore) {
		this.highscore = highscore;
	}

	/**
	 * @return The timestamp of when the last time a game started.
	 */
	public long getGameStart() {
		return gameStart;
	}

	/**
	 * @param gameStart
	 *            The timestamp of when the last tiem a game was started.
	 */
	public void setGameStart(long gameStart) {
		this.gameStart = gameStart;
	}

}
