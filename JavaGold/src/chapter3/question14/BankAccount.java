package chapter3.question14;

public class BankAccount {
	//口座名義人︎⭐︎アレンジ追加
	private String holder;
	//預金残高
	private int balance;
	
	//コンストラクタ⭐︎アレンジ追加
	public BankAccount(String holder, int balance) {
		this.holder = holder;
		this.balance = balance;
	}
	
	//アレンジ追加
	@Override
	public String toString() {
		return holder + "さん";
	}
	
	//入金処理
	public void desposit(int amount) {
		//実行に時間がかかる処理を表現しているだけ
		try {
			Thread.sleep(100);
		}catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		
		//預金残高を増やす
		this.balance += amount;
	}
	
	//出金処理
	public void withdrawals(int amount) {
		//実行に時間がかかる処理を表現しているだけ
		try {
			Thread.sleep(100);
		}catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		
		//預金残高を減らす
		this.balance -= amount;
	}
	
	//残高照会
	public int getBalance() {
		return balance;
	}
}
