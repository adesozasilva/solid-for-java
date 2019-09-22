package singleresponsibilityprinciple;

public class FoodPicker {
	
	public String execute(Animal animal) {
		return animal.getSpecie().getFoodType().getName();
	}

}
