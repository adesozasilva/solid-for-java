package example;

public class StudentBankAccount extends Account {

	@Override
	public void earn() {
		throw new RuntimeException("Student Account doesn't have this feature!");
	}

}

