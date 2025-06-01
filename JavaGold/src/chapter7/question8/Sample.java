package chapter7.question8;

//上限境界ワイルドカードを使用したSampleクラス
public class Sample {

	public static void main(String[] args) {
		Test<? extends B> test1 = new Test<B>(new B());
		B b1 = test1.getValue();
		b1.hello();

		Test<? extends B> test2 = new Test<C>(new C());
		B b2 = test2.getValue();
		b2.hello();
		
		//AはBを継承していないのでコンパイルエラー
		//Test<? extends B> test3 = new Test<A>(new A());
		
		//唯一代入できる値はnullリテラルのみなのでコンパイルエラー
		//test1.setValue(new B());
	}

}
