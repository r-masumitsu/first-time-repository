package chapter1.question14;

public interface Sample {
	//privateメソッド
	private void a() {
		// do something
	}
	public default void name() {
		a();
	}
}
