package chapter1.section3;

public class Account {
	String accountNo;	//口座番号（先頭に空白が入ることもある）
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}
	@Override
	public boolean equals(Object object) {
		if(object == this) {	//自身が引数として渡されたなら、無条件でtrueを返す。
			return true;
		}
		if(object == null) {	//nullが引数として渡されたなら、無条件でfalseを返す。
			return false;
		}
		if(!(object instanceof Account)) {	//型が異なるならば、falseを返す。
			return false;
		}
		Account account = (Account)object;	//型が同じなら比較できるように適切にキャストする。
		if(!this.accountNo.trim().equals(account.accountNo.trim())) {	//同じ文字列でないならば、falseを返す。
			return false;
		}
		return true;	//等価
	}
	
}
