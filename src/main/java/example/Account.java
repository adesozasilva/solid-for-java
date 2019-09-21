package example;

public class Account {
	
	protected double balance;

	public Account() {
        this.balance = 0;
    }

    public void deposit(double valor) {
        this.balance += valor;
    }

    public double getBalance() {
        return balance;
    }

    public void earn()      {
        this.balance*= 1.1;
    }   


}
