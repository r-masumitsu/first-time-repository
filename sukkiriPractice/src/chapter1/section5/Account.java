package chapter1.section5;

public class Account implements Comparable<Account>{
	int number;	//口座番号
	int zandaka;	//残高
	
	public Account(int number, int zandaka) {
		this.number = number;
		this.zandaka = zandaka;
	}
	
	@Override
	public int compareTo(Account obj) {
		if(this.number < obj.number) {
			return -1;
		}
		if(this.number > obj.number) {
			return 1;
		}
		return 0;
	}
	
	//セクション２サブセクション５で利用するために追加
	public int getNumber() {
		return number;
	}
	public int getZandaka() {
		return zandaka;
	}	
}
