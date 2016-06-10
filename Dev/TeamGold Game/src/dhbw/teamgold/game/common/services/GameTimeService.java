package dhbw.teamgold.game.common.services;

import dhbw.teamgold.engine.service.Service;

public interface GameTimeService extends Service {

	/**
	 * This method is used to determine if the player is currently able to play
	 * the game. the player has time left if:
	 * <ul>
	 * <li>The player has not started a game yet</li>
	 * <li>The player has not played for 15 minutes yet</li>
	 * <li>The last time the player started the game is one hour ago</li>
	 * </ul>
	 * 
	 * @return True when the player has no time left to play the game, false
	 *         otherwise.
	 */
	boolean isTimeOver();

	/**
	 * Used to determine if the player has started the game and is currently in
	 * the 15 minute time-frame. This means whenever isTimeTicking returns true
	 * isTimeOver will return false. But isTimeOver will also return false if
	 * the game has not started yet. <br/>
	 * Us this method in order to know when to start the ticking of the time.
	 * 
	 * @return True when the player is in the current 15 minute time-frame,
	 *         false otherwise.
	 */
	boolean isTimeTicking();

	/**
	 * Starts the 15 minute time-frame the player has to play the game. Always
	 * ensure that the time is not already ticking yet before invoking this
	 * method.
	 */
	void startTimeTicking();
	
	/**
	 * @return
	 */
	double getPercentOfTimeOver();

}
