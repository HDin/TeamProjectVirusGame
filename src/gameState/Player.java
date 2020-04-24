package gameState;

import java.util.ArrayList;

public class Player {
	
	private String name;
	private int age;
	private int immunity;
	private ArrayList<Integer> temporaryImmunity;
	private int hunger;
	private boolean isIll;
	private int money;
	private ArrayList<Item> heldItems;	
	
	public Player(String name, int age, int immunity) {
		this.name = name;
		this.age = age;
		this.immunity = immunity;
		temporaryImmunity = new ArrayList<>();
		hunger = 10;
		isIll = false;
		money = 100;
		heldItems = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getImmunity() {
		return immunity;
	}

	public void setImmunity(int immunity) {
		this.immunity = immunity;
	}

	public ArrayList<Integer> getTemporaryImmunity() {
		return temporaryImmunity;
	}

	public void addTemporaryImmunity(ArrayList<Integer> temporaryImmunity) {
		this.temporaryImmunity = temporaryImmunity;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public boolean isIll() {
		return isIll;
	}

	public void setIll(boolean isIll) {
		this.isIll = isIll;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public ArrayList<Item> getHeldItems() {
		return heldItems;
	}

	public void removeItem(Item item) {
		heldItems.remove(item);
	}
	
	public void addItem(Item item) {
		heldItems.add(item);
	}

}
