package main.controllers;

import gameState.Event;
import gameState.GameState;

public class EventController {
	
	public EventController() {
		
	}

	public void activateEvent(Event event) {
		GameState.getGameState().setCurrentEvent(event);		
	}

}
