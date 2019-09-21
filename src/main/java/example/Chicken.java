package example;

public class Chicken extends Bird {
	
	@Override
	public String fly() {
		throw new RuntimeException("The chicken can't fly!");
	}

}
