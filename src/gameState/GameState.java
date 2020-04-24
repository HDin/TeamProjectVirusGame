package gameState;

import java.util.ArrayList;

public class GameState {
	
	private static GameState GAMESTATEINSTANCE;
	
	private Location currentLocation;
	private Event currentEvent;
	private Player player;
	private double globalIllnessModifier;
	private int karma;
	
	private ArrayList<Event> events;
	
	private GameState() {
		currentLocation = new Location("home", (new Location("shop", null, null, currentLocation, null)), null, null, null);
		currentEvent = null;
		player = new Player("Test", 21, 70);
		globalIllnessModifier = 0.12;
		karma = 0;
		events = new ArrayList<>();
	}
	
	public static GameState getGameState() {
		if(GAMESTATEINSTANCE == null)
		{
			GAMESTATEINSTANCE = new GameState();
		}
		return GAMESTATEINSTANCE;
	}

	public Location getCurrentLocation() {
		return currentLocation;
	}
	
	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public Event getCurrentEvent() {
		return currentEvent;
	}
	
	public void setCurrentEvent(Event currentEvent) {
		this.currentEvent = currentEvent;
	}
	
	public double getGlobalIllnessModifier() {
		return globalIllnessModifier;
	}
	
	public void setGlobalIllnessModifier(double globalIllnessModifier) {
		this.globalIllnessModifier = globalIllnessModifier;
	}
	
	public int getKarma() {
		return karma;
	}
	
	public void adjustKarma(int karma) {
		this.karma += karma;
	}

	public ArrayList<Event> getEvents(){
		return events;
	}
	
	public void removeEvent(Event event) {
		events.remove(event);
	}
	
	public void addEvent(Event event) {
		events.add(event);
	}
}
