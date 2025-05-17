package chapter2.question2;

import java.util.function.Supplier;

public class Test {
	public void execute(Supplier<A> supplier) {
		System.out.println("お決まりの事前処理");
		A a = supplier.get();
		a.hello();
		System.out.println("お決まりの事後処理");
	}
}
