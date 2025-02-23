package chapter1.section3;

import chapter1.section2.Hero;

public class AccountMain {

	public static void main(String[] args) {
		Account account1 = new Account("8963512");
		Account account2 = null;
		Hero hero = new Hero("ミナト", 100, 10);
		Account account3 = new Account("3512648");
		Account account4 = new Account("  45689123  ");
		Account account5 = new Account("   8963512");
		Account account6 = new Account("8963512   ");
		Account account7 = new Account("8963512");
		
		System.out.println(account1.equals(account2));
		System.out.println(account1.equals(hero));
		System.out.println(account1.equals(account3));
		System.out.println(account1.equals(account4));
		System.out.println(account1.equals(account5));	//等価
		System.out.println(account1.equals(account6));	//等価
		System.out.println(account1.equals(account7));	//等価
	}

}
