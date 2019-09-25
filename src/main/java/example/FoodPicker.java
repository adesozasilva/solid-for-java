package example;

public class FoodPicker {
	
	public String getFood(Object animal) {
		if(animal instanceof Dog)
			return "T-BONE";
		
		if(animal instanceof Cat)
			return "FISH";
		
		throw new RuntimeException("Invalid Animal!");
	}

}
