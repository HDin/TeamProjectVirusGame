package main.controllers.actions;

public class EventChoice extends Action{
	
	private String chosenEventOption;
	
	public EventChoice(String chosenEventOption) {
		this.chosenEventOption = chosenEventOption;
	}
	
	public String getChosenEventOption() {
		return chosenEventOption;
	}

}
