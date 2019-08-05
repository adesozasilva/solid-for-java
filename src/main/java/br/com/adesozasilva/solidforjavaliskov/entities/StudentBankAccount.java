package br.com.adesozasilva.solidforjavaliskov.entities;

public class StudentBankAccount implements Account {

    private int milhas;
	private CurrentBalanceManager manager;
	
	public StudentBankAccount() {
		this.manager = new CurrentBalanceManager();
	}

    public int getMilhas() {
        return milhas;
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

