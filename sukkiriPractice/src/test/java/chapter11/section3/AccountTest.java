package test.java.chapter11.section3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.chapter11.section2.Account;

class AccountTest {

	@Test
	public void instantiate() {
		Account a = new Account("ミナト", 30000);
		assertEquals("ミナト", a.getOwner());
	}
	
	@Test
	public void transfer() {
		//教本に何も書かれていなかった。
	}
}
