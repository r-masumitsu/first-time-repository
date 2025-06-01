package chapter7.question5;

//型パラメータとして使用できるクラスをAクラスにもしくはAクラスのサブクラスに制限することができる
public class Test<T extends A> {
	public void execute(T t) {
		t.hello();
	}
}
