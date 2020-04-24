package gameState;

import java.util.ArrayList;

public class Event {
	
	private String name;
	private Location location;
	private double occurrenceProbability;
	private boolean isSingleOccurrence;
	private ArrayList<String> eventOptions;
	private Event followingEvent;

	
	public Event(String name, Location location, double occurrenceProbability, boolean isSingleOccurrence, ArrayList<String> eventOptions, Event followingEvent) {
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
	
	public ArrayList<String> getEventOptions() {
		return eventOptions;
	}
	
	public void setEventOptions(ArrayList<String> eventOptions) {
		this.eventOptions = eventOptions;
	}
	
	public Event getFollowingEvent() {
		return followingEvent;
	}
	
	public void setFollowingEvent(Event followingEvent) {
		this.followingEvent = followingEvent;
	}
}
