package main.java.chapter11.section2;

public class Account {
	private String owner; //口座名義人
	private int zandaka; //口座残高
	
	//ゲッターセッター
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getZandaka() {
		return zandaka;
	}
	public void setZandaka(int zandaka) {
		this.zandaka = zandaka;
	}

	//引数を２つ持つコンストラクタ
	public Account(String owner, int zandaka) {
		this.owner = owner;
		this.zandaka = zandaka;
	}

	//送金を行うメソッド
	public void transfer(Account dest, int amount) {
		dest.zandaka += amount;
		zandaka -= amount;
	}
}
