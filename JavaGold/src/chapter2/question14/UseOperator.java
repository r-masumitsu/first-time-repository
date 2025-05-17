package chapter2.question14;

import java.util.function.BinaryOperator;

public class UseOperator {

	public static void main(String[] args) {
		BinaryOperator<Integer> opAdd = OperatorFactory.add();
		BinaryOperator<Integer> opMinus = OperatorFactory.minus();

		System.out.println(opAdd.apply(10, 20));
		System.out.println(opMinus.apply(10, 20));
	}

}
