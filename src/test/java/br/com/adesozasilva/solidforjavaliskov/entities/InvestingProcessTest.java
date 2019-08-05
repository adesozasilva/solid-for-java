package br.com.adesozasilva.solidforjavaliskov.entities;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class InvestingProcessTest {

	@Test
    public void shouldEarnMoneyOnlyCommonAccount() {

        for (Account account : bankAccounts()) {
        	if(account instanceof CommonAccount) {
        		CommonAccount commonAccount = (CommonAccount) account;
        		commonAccount.earn();
        		System.out.println("New Balance:");
        		System.out.println(account.getCurrentBalance());
        		
        		assertEquals(account.getCurrentBalance(), 101, 0.10);
        		account.getCurrentBalance();
        	}

        }
    }

    private List<Account> bankAccounts() {
        return Arrays.asList(commonAccount(100), studentBankAccountWith(200));
    }

    private Account studentBankAccountWith(double amount) {
        StudentBankAccount c = new StudentBankAccount();
        c.deposit(amount);
        return c;
    }

    private Account commonAccount(double valor) {
        CommonAccount c = new CommonAccount();
        c.deposit(valor);
        return c;
    }
}

