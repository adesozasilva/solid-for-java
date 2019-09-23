package singleresponsibilityprinciple;

public class FoodPicker {
	
	public String getFood(Animal animal) {
		return animal.getSpecie().getFoodType().getName();
	}

}
