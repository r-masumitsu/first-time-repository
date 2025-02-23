package main.java.chapter12;

public class Account {
	String owner; //口座名義人
	int zandaka; //口座残高

	public Account(String owner, int zandaka) {
		this.owner = owner;
		this.zandaka = zandaka;
	}

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

	public void transfer(Account dest, int amount) {
		dest.zandaka += amount;
		zandaka -= amount;
	}
}
