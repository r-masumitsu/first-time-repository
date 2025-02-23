package chapter5.section3;

import org.apache.commons.lang3.builder.HashCodeBuilder;

public class HashBank {
	String name;
	String address;
	
	public int hashCode() {
		//この一行だけで、HashBankクラスの全フィールドからハッシュ値を生成できる
		return HashCodeBuilder.reflectionHashCode(this);
	}
}
