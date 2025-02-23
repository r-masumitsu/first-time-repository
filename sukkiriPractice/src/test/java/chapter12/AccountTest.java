package test.java.chapter12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.chapter12.Account;

class AccountTest {

	@Test
	public void instatiate() {
		Account account = new Account("ミナト", 30000);
		assertEquals("ミナト", account.getOwner());
		assertEquals(30000, account.getZandaka());
	}

	@Test
	public void transfer() {
		//何かしらのコード
	}
}
