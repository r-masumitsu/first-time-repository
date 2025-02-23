package test.java.chapter11.section6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.chapter11.section6.Bank;

class BankTest {

	Bank bank1 = new Bank();

	@Test
	public void setGetName_lessThan3() {
		bank1.setName("ケニー");
		assertEquals("ケニー", bank1.getName());
	}

	@Test
	public void setGetName_3orMore() {
		try {
			bank1.setName("ポニ");
		} catch (IllegalArgumentException e) {
			e.getMessage();
			e.printStackTrace();
		} finally {
			assertEquals(null, bank1.getName());
		}
	}
}
