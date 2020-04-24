package gameState;

public class Item {
	
	private String name;
	private int immunityGiven;
	private int hungerGiven;
	
	
	public Item(String name, int immunityGiven, int hungerGiven) {
		this.name = name;
		this.immunityGiven = immunityGiven;
		this.hungerGiven = hungerGiven;
	}
	
	public String getName() {
		return name;
	}
	
	public int getImmunityGiven() {
		return immunityGiven;
	}
	
	public int getHungerGiven() {
		return hungerGiven;
	}


}
