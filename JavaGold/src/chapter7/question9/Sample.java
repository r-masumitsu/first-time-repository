package chapter7.question9;

public class Sample {

	public static void main(String[] args) {
		Test<? super B> a = new Test<A>(new A());
		Test<? super B> b = new Test<B>(new B());

		//型パラメータにはBもしくはより上位しか使えないのでコンパイルエラー
		//Test<? super B> c = new Test<C>(new C());

		//AはBのサブクラスではなのでコンパイルエラー
		//a.setValue(new A());
		a.setValue(new B());
		b.setValue(new C());

		//取り出すときに何型が入っているかが不明なためObject型になる
		Object objA = a.getValue();
		Object objB = b.getValue();
		System.out.println(objA.toString());
		System.out.println(objB.toString());
		
		//任意の型で扱う場合にはキャストが必要（ただし安全でない）
		A aObj = (A)a.getValue();
		B bObj = (B)b.getValue();
		aObj.hello();
		bObj.hello();
	}

}
