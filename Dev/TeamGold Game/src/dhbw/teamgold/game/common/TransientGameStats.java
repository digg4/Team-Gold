package dhbw.teamgold.game.common;

/**
 * The stats that are new for every game and will not be saved when the game
 * closes. This is a POJO.
 * 
 * @author Daniel Spaniol
 */
public class TransientGameStats {

	/**
	 * The players score in the current run.
	 */
	private int score;
	/**
	 * The remaining lives of the player.
	 */
	private int lives;
	/**
	 * The current difficulty. Will be incremented every level.
	 */
	private int difficulty;

	/**
	 * @return The players current score.
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score
	 *            The players new score.
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @return The remaining lives.
	 */
	public int getLives() {
		return lives;
	}

	/**
	 * @param lives
	 *            The now remaining lives.
	 */
	public void setLives(int lives) {
		this.lives = lives;
	}

	/**
	 * @return The difficulty. Higher value means higehr difficulty.
	 */
	public int getDifficulty() {
		return difficulty;
	}

	/**
	 * @param difficulty
	 *            The new difficulty. Increment to make the game harder,
	 *            decrement to make the game easier.
	 */
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
}
