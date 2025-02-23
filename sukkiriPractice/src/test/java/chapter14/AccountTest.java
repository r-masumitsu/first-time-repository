package test.java.chapter14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.chapter14.Account;


class AccountTest {

	@Test
	public void testDeniesNegativeZandakaSet() {
		Account account = new Account();
		assertThrows(IllegalArgumentException.class, () -> account.setZandaka(-100));
	}

}
