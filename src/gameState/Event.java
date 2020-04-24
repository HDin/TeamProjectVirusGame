package gameState;

import java.util.HashMap;

public class Event {
	
	private String name;
	private Location location;
	private double occurrenceProbability;
	private boolean isSingleOccurrence;
	private HashMap<String, Integer> eventOptions;
	private Event followingEvent;
	private String chosenOption;

	
	public Event(String name, Location location, double occurrenceProbability, boolean isSingleOccurrence, HashMap<String, Integer> eventOptions, Event followingEvent) {
		this.name = name;
		this.location = location;
		this.occurrenceProbability = occurrenceProbability;
		this.isSingleOccurrence = isSingleOccurrence;
		this.eventOptions = eventOptions;
		this.followingEvent = followingEvent;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public double getOccurrenceProbability() {
		return occurrenceProbability;
	}
	
	public void setOccurrenceProbability(double occurrenceProbability) {
		this.occurrenceProbability = occurrenceProbability;
	}
	
	public boolean getIsSingleOccurrence() {
		return isSingleOccurrence;
	}
	
	public void setIsSingleOccurrence(boolean isSingleOccurence) {
		this.isSingleOccurrence = isSingleOccurence;
	}
	
	public HashMap<String, Integer> getEventOptions() {
		return eventOptions;
	}
	
	public void setEventOptions(HashMap<String, Integer> eventOptions) {
		this.eventOptions = eventOptions;
	}
	
	public Event getFollowingEvent() {
		return followingEvent;
	}
	
	public void setFollowingEvent(Event followingEvent) {
		this.followingEvent = followingEvent;
	}
	
	public String getChosenOption() {
		return chosenOption;
	}
	
	public void setOptionSelected(String chosenOption) {
		this.chosenOption = chosenOption;
	}
}
