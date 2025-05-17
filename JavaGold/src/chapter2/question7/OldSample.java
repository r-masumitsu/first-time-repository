package chapter2.question7;

import chapter2.question7.Person.Gender;

//論理演算の組み合わせによる条件判定
public class OldSample {

	public static void main(String[] args) {
		Person sample = new Person(Gender.MALE, 19);
		
		if(sample.getGender().equals(Gender.MALE)
				|| sample.getGender().equals(Gender.FEMALE)
				&& sample.getAge() >= 20) {
			System.out.println("OK");
			return;
		}
		System.out.println("NG");
	}
	
}
