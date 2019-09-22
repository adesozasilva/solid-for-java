package singleresponsibilityprinciple;

public enum SpecieAnimal {
	
	CHICKEN(new FoodType("Milho")), CAT(new FoodType("Peixe")), DOG(new FoodType("T-Bone"));
	
	private FoodType foodType;
	
	private SpecieAnimal(FoodType foodType) {
		this.foodType = foodType;
	}
	
	public FoodType getFoodType() {
		return foodType;
	}
	
}
