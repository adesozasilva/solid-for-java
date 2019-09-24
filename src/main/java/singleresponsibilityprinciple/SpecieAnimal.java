package singleresponsibilityprinciple;

public enum SpecieAnimal {
	
	CHICKEN(new FoodType("CORN")), 
	CAT(new FoodType("FISH")), 
	DOG(new FoodType("T-BONE"));
	
	private FoodType foodType;
	
	private SpecieAnimal(FoodType foodType) {
		this.foodType = foodType;
	}
	
	public FoodType getFoodType() {
		return foodType;
	}
	
}
