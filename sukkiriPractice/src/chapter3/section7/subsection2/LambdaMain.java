package chapter3.section7.subsection2;

import chapter3.section7.subsection1.Func1;
import chapter3.section7.subsection1.Func2;

public class LambdaMain {

	public static void main(String[] args) {
		final int POINT = 70;
		final String NAME = "ミナト"; 
		
		Func1 func1 = x -> x % 2 == 1;
		
		Func2 func2 = (point,name) -> name + "さんは" + ( point > 65 ? "合格" : "不合格");
		
		System.out.println(POINT + "は" + (func1.isOdd(POINT) ? "奇数" : "偶数"));
		System.out.println(func2.passCheck(POINT, NAME));
		
	}

}
