package example;

public class PaymentAccount extends Account {
	
	@Override
	public void earn() {
		throw new RuntimeException("Student Account doesn't have this feature!");
	}

}