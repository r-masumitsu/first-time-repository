package chapter7.question5;

public class Sample {

	public static void main(String[] args) {
		Test<A> a = new Test<>();
		Test<B> b = new Test<>();
		/*
		 * コンパイルエラー
		 * 制約の不一致: 型 C は、型 Test<T> の制約付きパラメーター <T extends A> の代替として有効ではありません
		 */
		//Test<C> c = new Test<>();
		
		a.execute(new A());
		a.execute(new B());
		b.execute(new B());
	}

}
