package openclosedprinciple;

public class SpecieAnimal {
	
	private String name;
	private FoodType foodType;
	
	public SpecieAnimal(String name, FoodType foodType) {
		this.name = name;
		this.foodType = foodType;
	}

	public String getName() {
		return name;
	}
	
	public FoodType getFoodType() {
		return foodType;
	}
	
}
