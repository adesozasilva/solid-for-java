package liskovsubstitutionprinciple;

public class StudentBankAccount implements Account {

    private int points;
	private CurrentBalanceManager manager;
	
	public StudentBankAccount() {
		this.manager = new CurrentBalanceManager();
	}

    public int getPoints() {
        return points;
    }

	@Override
	public double getCurrentBalance() {
		return manager.getCurrentBalance();
	}

	@Override
	public void deposit(double valor) {
		manager.deposit(valor);
	}

}

