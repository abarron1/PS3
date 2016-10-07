package ACC;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccountTest {

	@Test
	public void test() throws InsufficientFundsException {
		Account account = new Account(1122, 20000, 0.045);
		assertEquals(account.getId(), 1122);
		assertEquals(account.getBalance(), 20000, 0.001);
		assertEquals(account.getAnnualInterestRate(), 0.045, 0.001);
		account.deposit(3000);
	}
}