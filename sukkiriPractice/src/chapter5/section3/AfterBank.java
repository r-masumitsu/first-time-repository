package chapter5.section3;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class AfterBank {
	String name;
	String address;
	
	public boolean equals(Object object) {
		//この一行だけで、「全てのフィールドが等価ならインスタンスも等価と見なす」機能を一行で実現できる
		return EqualsBuilder.reflectionEquals(this, object);
	}
}
