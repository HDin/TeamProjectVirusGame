package main.controllers.actions;

import gameState.Location;

public class Move extends Action {
	
	private Location locationToMoveTo;
	
	public Move(Location location) {
		locationToMoveTo = location;
	}
	
	public Location getLocation() {
		return locationToMoveTo;
	}

}
