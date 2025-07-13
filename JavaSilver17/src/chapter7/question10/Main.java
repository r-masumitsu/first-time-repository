package chapter7.question10;

public class Main {

	public static void main(String[] args) {
		Object[] objects = {
				new A(), new B(), "C"
		};
		for(Object obj : objects) {
			test(obj);
		}
	}
	
	private static void test(Object obj) {
		if(obj instanceof A b) {
			b.execute();	//動的バインディング（メソッドの呼び出しは実行時（＝プログラムが動いているとき）に、オブジェクトの実体に応じて決定される）
		}
	}

}
