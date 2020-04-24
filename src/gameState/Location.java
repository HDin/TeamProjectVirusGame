package gameState;

public class Location {
	
	private String name;
	private Location north;
	private Location east;
	private Location south;
	private Location west;
	
	public Location(String name, Location north, Location east, Location south, Location west) {
		this.name = name;
		this.north = north;
		this.east = east;
		this.south = south;
		this.west = west;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Location getNorth() {
		return north;
	}

	public void setNorth(Location north) {
		this.north = north;
	}

	public Location getEast() {
		return east;
	}

	public void setEast(Location east) {
		this.east = east;
	}

	public Location getSouth() {
		return south;
	}

	public void setSouth(Location south) {
		this.south = south;
	}

	public Location getWest() {
		return west;
	}

	public void setWest(Location west) {
		this.west = west;
	}
	
	
	
}
