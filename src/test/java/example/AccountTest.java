package example;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AccountTest {

	@Test
	public void test() {
		for (Account account : bankAccounts()) {
			account.earn();

			System.out.println("Novo Saldo:");
			System.out.println(account.getBalance());
		}

	}

	private static List<Account> bankAccounts() {
		return Arrays.asList(aPaymentAccountWith(100), aPaymentAccountWith(150), studentBankAccountWith(200));
	}

	private static Account studentBankAccountWith(double amount) {
		Account studentBankAccount = new StudentBankAccount();
		studentBankAccount.deposit(amount);
		return studentBankAccount;
	}

	private static Account aPaymentAccountWith(double valor) {
		Account paymentAccount = new PaymentAccount();
		paymentAccount.deposit(valor);
		return paymentAccount;
	}

}
