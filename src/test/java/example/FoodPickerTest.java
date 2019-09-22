package example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FoodPickerTest {

	@Test
	public void test() {
		Animal cat = new Animal(SpecieAnimal.CAT);
		Animal dog = new Animal(SpecieAnimal.DOG);
		Animal chicken = new Animal(SpecieAnimal.CHICKEN);
		
		FoodPicker foodPicker = new FoodPicker();
		
		assertEquals(foodPicker.getFood(cat), "Peixe");
		assertEquals(foodPicker.getFood(chicken), "Milho");
		assertEquals(foodPicker.getFood(dog), "T-Bone");
	}

}
