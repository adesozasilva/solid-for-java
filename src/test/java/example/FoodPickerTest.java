package example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FoodPickerTest {

	@Test
	public void test() {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		FoodPicker foodPicker = new FoodPicker();
		
		assertEquals(foodPicker.getFood(cat), "FISH");
		assertEquals(foodPicker.getFood(dog), "T-BONE");
	}

}
