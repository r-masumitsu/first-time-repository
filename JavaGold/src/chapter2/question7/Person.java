package chapter2.question7;

public class Person {
	public enum Gender {
		MALE, FEMALE
	}

	private Gender gender;
	private int age;

	public Person(Gender gender, int age) {
		super();
		this.gender = gender;
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}
}
