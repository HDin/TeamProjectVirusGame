package main.controllers;

import java.util.ArrayList;
import java.util.Random;

import gameState.Event;
import gameState.GameState;
import main.controllers.actions.Move;

public class EventPickerController {
	
	public EventPickerController() {
		
	}
	
	public Event pickEvent(Move move, Random random) {
		if(GameState.getGameState().getCurrentEvent() == null) {
			ArrayList<Event> events = GameState.getGameState().getEvents();
			for(int i=0; i < events.size(); i++) {
				if(!(events.get(i).getLocation().getName() == move.getLocation().getName())) {
					events.remove(i);
				}
			}
			for(int i=0; i < events.size(); i++) {
				if(events.get(i).getOccurrenceProbability() > random.nextDouble()) {
					events.remove(i);
				}
			}
			if(events.size() != 0) {
				return events.get(random.nextInt(events.size()));
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

}
