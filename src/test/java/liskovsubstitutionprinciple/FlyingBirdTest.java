package liskovsubstitutionprinciple;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FlyingBirdTest {

	@Test
	public void test() {
		birds().forEach(bird -> {
			if(bird instanceof FlyingBird) {
				FlyingBird flyingBird = (FlyingBird) bird;
				assertEquals("Fly implementation", flyingBird.fly());
			}
		});
	}
	
	public static List<Bird> birds() {
		return Arrays.asList(new Eagle(), new Ostrich());
	}

}
