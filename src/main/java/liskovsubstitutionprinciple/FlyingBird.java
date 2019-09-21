package liskovsubstitutionprinciple;

public interface FlyingBird {
	
	default String fly() {
		return "Fly implementation";
	}

}
