package br.com.adesozasilva.solidforjavaliskov.entities;

public class CurrentBalanceManager {
	
    private double currentBalance;

	public void deposit(double value) {
        this.currentBalance += value;
    }

    public void saca(double value) {
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
