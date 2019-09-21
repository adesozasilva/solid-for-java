package liskovsubstitutionprinciple;

public class Eagle implements Bird, FlyingBird {
	
	private FlyAction flyAction;
	
	public Eagle() {
		this.flyAction = new FlyAction();
	}
	
	public String fly() {
		return flyAction.execute();
	}

}
