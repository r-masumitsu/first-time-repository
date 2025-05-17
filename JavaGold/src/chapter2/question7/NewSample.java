package chapter2.question7;

import java.util.function.Predicate;

import chapter2.question7.Person.Gender;

//複数のPredicateオブジェクトを合成して複合条件を判定
public class NewSample {

	public static void main(String[] args) {
		Predicate<Person> isMale = 
				p -> p.getGender().equals(Gender.MALE);
		Predicate<Person> isFemale =
				p -> p.getGender().equals(Gender.FEMALE);
		Predicate<Person> isAdult =
				p -> p.getAge() >= 20;
		
		Predicate<Person> criteria = isMale.or(isFemale.and(isAdult));
				
		Person sample = new Person(Gender.MALE, 19);
		
		if(criteria.test(sample)) {
			System.out.println("OK");
			return;
		}
		System.out.println("NG");
	}

}
