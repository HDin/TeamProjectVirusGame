package main.controllers;

import gameState.GameState;
import gameState.Location;
import main.controllers.actions.Move;

public class MovementController {
	
	
	public MovementController() {
		
	}
	
	public void move(Move move) {
		GameState.getGameState().setCurrentLocation(move.getLocation());
	}

}
