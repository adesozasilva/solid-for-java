package br.com.adesozasilva.solidforjavaliskov.entities;

public class CommonAccount implements Account {

	private CurrentBalanceManager manager;

    public CommonAccount() {
    	this.manager = new CurrentBalanceManager();
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