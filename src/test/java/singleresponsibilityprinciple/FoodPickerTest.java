package singleresponsibilityprinciple;

import static org.junit.Assert.*;

import org.junit.Test;

public class FoodPickerTest {

	@Test
	public void test() {
		Animal cat = new Animal(new SpecieAnimal("CAT", new FoodType("FISH")));
		Animal dog = new Animal(new SpecieAnimal("DOG", new FoodType("T-BONE")));
		Animal chicken = new Animal(new SpecieAnimal("CHICKEN", new FoodType("CORN")));
		
		FoodPicker foodPicker = new FoodPicker();
		
		assertEquals(foodPicker.getFood(cat), "FISH");
		assertEquals(foodPicker.getFood(chicken), "CORN");
		assertEquals(foodPicker.getFood(dog), "T-BONE");
	}

}
