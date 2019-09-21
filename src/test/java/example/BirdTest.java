package example;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BirdTest {

	@Test
	public void test() {
		birds().forEach(bird -> {
			assertEquals("Fly implementation", bird.fly());
		});
	}
	
	public static List<Bird> birds() {
		return Arrays.asList(new Chicken(), new Duck());
	}

}
