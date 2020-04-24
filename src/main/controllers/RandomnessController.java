package main.controllers;

import java.util.Random;

public class RandomnessController {
	
	private Random random;
	
	public RandomnessController(long seed) {
		random = new Random(seed);
	}

	public RandomnessController() {
		random = new Random();
	}
	
	public Random getRandom() {
		return random;
	}
}
