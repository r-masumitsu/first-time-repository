package chapter3.section7.subsection3;

import java.util.function.Predicate;

import chapter3.section7.subsection1.Func2;

public class PredicateMain {

	public static void main(String[] args) {
		final int POINT = 70;
		final String NAME = "ミナト"; 
		
		//Func1 func1 = x -> x % 2 == 1;
		Predicate<Integer> func1 = x -> x % 2 == 1;
		
		Func2 func2 = (point,name) -> name + "さんは" + ( point > 65 ? "合格" : "不合格");
		
		System.out.println(POINT + "は" + (func1.test(POINT) ? "奇数" : "偶数"));
		System.out.println(func2.passCheck(POINT, NAME));
		
	}

}
