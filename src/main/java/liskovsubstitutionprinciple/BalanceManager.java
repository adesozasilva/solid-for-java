package liskovsubstitutionprinciple;

public class BalanceManager {
	
    private double currentBalance;

	public void deposit(double value) {
        this.currentBalance += value;
    }

    public void withdraw(double value) {
        if (value <= this.currentBalance) {
            this.currentBalance -= value;
        } else {
            throw new IllegalArgumentException();
        }
    }
    
    public double getCurrentBalance() {
		return currentBalance;
	}

}
