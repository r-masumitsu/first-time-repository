package chapter8.question5;

public class B extends A{
	//@Overrideにより、コンパイラがスーパークラスのオーバーライドされた側のメソッドとシグニチャが一致するかどうかをチェックする。
//	@Override
	public void hello() {
		System.out.println("hi.");
	}
}
