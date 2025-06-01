package chapter7.question7;

public class Sample {

	public static void main(String[] args) {
		Test<?> test = new Test<>("Hello");
		
		//返ってきたObject型をStringにキャストしているだけ
		String msg = (String)test.getValue();
		System.out.println(msg);
		
		//唯一代入できる値はnullリテラルのみなのでコンパイルエラー
		//test.setValue("sample");
		//test.setValue(new Object());
		test.setValue(null);
	}

}
