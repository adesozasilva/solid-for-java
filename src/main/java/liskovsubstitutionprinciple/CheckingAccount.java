package liskovsubstitutionprinciple;

public class CheckingAccount implements Account {

	private BalanceManager manager;

    public CheckingAccount() {
    	this.manager = new BalanceManager();
    }

    public void earn() {
    	manager.deposit((manager.getCurrentBalance()  * 0.01));
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