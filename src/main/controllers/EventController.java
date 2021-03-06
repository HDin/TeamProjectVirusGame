package main.controllers;

import gameState.Event;
import gameState.GameState;
import main.controllers.actions.EventChoice;

public class EventController {
	
	public EventController() {
		
	}

	public void activateEvent(Event event) {
		if(!(event == null)) {
			GameState.getGameState().setCurrentEvent(event);	
		}	
	}
	
	public void chooseEventOption(EventChoice event) {
		if(!(event == null)) {
			int karma = GameState.getGameState().getCurrentEvent().getEventOptions().get(event.getChosenEventOption());
			GameState.getGameState().adjustKarma(karma);
		}
	}

}
