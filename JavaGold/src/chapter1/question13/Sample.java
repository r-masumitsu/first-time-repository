package chapter1.question13;

//＜コンパイルエラー＞継承メソッド B.test() は A 内の public 抽象メソッドを隠蔽できません
//public class Sample extends B implements A{
	
public class Sample extends B{
	public static void main(String[] args) {
		new Sample().test();
	}

}
