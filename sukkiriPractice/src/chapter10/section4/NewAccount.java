package chapter10.section4;

import chapter10.section3.Account;
import chapter10.section3.Bank;
import chapter10.section3.JavadocTagAccount;

//アノテーションを使って開発者の意図をコンパイラに伝える

@SuppressWarnings("serial") //NewAccountではserialVersionUIDに関する警告を出さない
public class NewAccount extends JavadocTagAccount {
	@Override //transfer()はオーバーライドであることを宣言
	public int transfer(Bank bank, Account dest, int amount) {
		return 120;
	}

	@Deprecated	//transfer()は非推奨であることを宣言
	public void trasfer(Account dest, int amount) {

	}
}
