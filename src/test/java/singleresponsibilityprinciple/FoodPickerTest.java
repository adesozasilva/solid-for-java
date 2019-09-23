package singleresponsibilityprinciple;

import static org.junit.Assert.*;

import org.junit.Test;

public class FoodPickerTest {

	@Test
	public void test() {
		Animal cat = new Animal(new SpecieAnimal("CAT", new FoodType("Peixe")));
		Animal dog = new Animal(new SpecieAnimal("DOG", new FoodType("T-Bone")));
		Animal chicken = new Animal(new SpecieAnimal("DOG", new FoodType("Milho")));
		
		FoodPicker foodPicker = new FoodPicker();
		
		assertEquals(foodPicker.getFood(cat), "Peixe");
		assertEquals(foodPicker.getFood(chicken), "Milho");
		assertEquals(foodPicker.getFood(dog), "T-Bone");
	}

}
