package example;

public class FoodPicker {
	
	public String getFood(Animal animal) {
		if(animal.getSpecie().equals(SpecieAnimal.CAT)) {
			return "FISH";
		}
		if(animal.getSpecie().equals(SpecieAnimal.CHICKEN)) {
			return "CORN";
		}
		if(animal.getSpecie().equals(SpecieAnimal.DOG)) {
			return "T-BONE";
		}
		
		throw new RuntimeException("Invalid Animal!");
	}

}
