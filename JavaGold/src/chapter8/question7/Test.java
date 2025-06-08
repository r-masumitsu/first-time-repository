package chapter8.question7;

public class Test {
	//testメソッドが非推奨であることを明示
	//@Deprecated
	//将来的に削除予定のあるメソッドに対するアノテーション（より強く使用を抑制）
	@Deprecated(forRemoval = true)
	public void test() {};
}
