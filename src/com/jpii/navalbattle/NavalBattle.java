/*
 * Copyright (C) 2012 JPII and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.jpii.navalbattle;

import com.jpii.roketgamer.RoketGamer;
import com.jpii.navalbattle.data.Commands;
import com.jpii.navalbattle.data.Constants;
import com.jpii.navalbattle.data.GameState;
import com.jpii.navalbattle.debug.CommandHandler;
import com.jpii.navalbattle.debug.DebugWindow;
import com.jpii.navalbattle.gui.LoginWindow;

public class NavalBattle {

	private static RoketGamer roketGamer;
	private static DebugWindow debugWindow;
	private static GameState gameState;
	private static CommandHandler commandHandler;
	
	public static void main(String[] args) {
		debugWindow = new DebugWindow();
		gameState = new GameState();
		roketGamer = new RoketGamer();
		
		commandHandler = new CommandHandler(Commands.COMMANDS);		
		
		debugWindow.printInfo("NavalBattle " + Constants.NAVALBATTLE_VERSION + " initialized");
		new LoginWindow();
	}
	
	/**
	 * Returns current instance of RoketGamer.
	 * 
	 * @return roketGamer
	 */
	public static RoketGamer getRoketGamer() {
		return roketGamer;
	}
	
	/**
	 * Returns current instance of DebugWindow.
	 * 
	 * @return debugWindow
	 */
	public static DebugWindow getDebugWindow() {
		return debugWindow;
	}
	
	/**
	 * Returns current instance of GameState.
	 * 
	 * @return gameState
	 */
	public static GameState getGameState() {
		return gameState;
	}
	
	/**
	 * Returns current instance of CommandHandler.
	 * 
	 * @return commandHandler
	 */
	public static CommandHandler getCommandHandler() {
		return commandHandler;
	}
	
	/**
	 * Used as global game exit
	 */
	public static void close() {
		NavalBattle.getDebugWindow().printInfo("Someone is closing me!");
		System.exit(0);
	}
}