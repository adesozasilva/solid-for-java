package example;

public class FoodPicker {
	
	public String getFood(Animal animal) {
		if(animal.getSpecie().equals(SpecieAnimal.CAT)) {
			return "Peixe";
		}
		if(animal.getSpecie().equals(SpecieAnimal.CHICKEN)) {
			return "Milho";
		}
		if(animal.getSpecie().equals(SpecieAnimal.DOG)) {
			return "T-Bone";
		}
		
		throw new RuntimeException("Invalid Animal!");
	}

}
