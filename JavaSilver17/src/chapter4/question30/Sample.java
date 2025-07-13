package chapter4.question30;

public class Sample {
	//追加
	private static B b = new B();
	
	public static void main(String[] args) {
		A[] array = {new A(), new B(), new A(), new B()};
		
		for(A a : array) {
			if(a instanceof B b) {
				// この中では a も b も B 型として使う
				a.test();
			}else {
				b.test();	// クラスのstatic変数b（B型）を使用
			}
		}
	}

}
