package chapter5.section3;

public class BeforeBank {
	String name;
	String address;
	
	@Override
	public boolean equals(Object object) {
		//引数のオブジェクトが自身であるとき
		if(object == this) {
			return true;
		}
		//引数がnullであるとき
		if(object == null) {
			return false;
		}
		//引数のオブジェクトの型がBeforeBankでないとき
		if(!(object instanceof BeforeBank)) {
			return false;
		}
		//引数のオブジェクトをBeforeBank型にキャスト
		BeforeBank rBank = (BeforeBank)object;
		//引数のオブジェクトのフィールドnameが同値でないとき
		if(!this.name.equals(rBank.name)) {
			return false;
		}
		//引数のオブジェクトのフィールドaddressが同値でないとき
		if(!this.name.equals(rBank.address)) {
			return false;
		}
		return true;
	}
}

