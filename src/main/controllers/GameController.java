package main.controllers;

import javax.crypto.spec.IvParameterSpec;

import gameState.GameState;
import main.controllers.actions.Action;
import main.controllers.actions.Buy;
import main.controllers.actions.Move;
import main.controllers.actions.Sell;
import main.controllers.actions.Use;

public class GameController {
	
	private final GameState game = GameState.getGameState();
	
	private MovementController movementController;
	private EventController eventController;
	private EventPickerController eventPickerController;
	private InventoryController inventoryController;
	private TimeController timeController;
	private RandomnessController randomnessController;
	
	public GameController(long seed) {
		movementController = new MovementController();
		eventController = new EventController();
		eventPickerController = new EventPickerController();
		inventoryController = new InventoryController();
		timeController = new TimeController();
		if(seed != 0) {
			randomnessController = new RandomnessController(seed);
		} else {
			randomnessController = new RandomnessController();
		}
	}
	
	public void takeAction(Action action) {
		if(action instanceof Move) {
			movementController.move((Move) action);
			eventController.activateEvent(eventPickerController.pickEvent((Move) action, randomnessController.getRandom()));
		} else if(action instanceof Use) {
			inventoryController.use((Use) action);
		} else if(action instanceof Buy) {
			inventoryController.buy((Buy) action);
		} else if(action instanceof Sell) {
			inventoryController.sell((Sell) action);
		}
	}

}
