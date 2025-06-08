package chapter8.question7;

//コンパイラの警告を抑制することを明示
//@SuppressWarnings("unchecked")
//非推奨のメソッドを使用しても警告を抑制することを明示
//@SuppressWarnings("deprecation")
//@Deprecated(forRemoval = true)がマークされたメソッドの使用時に警告を抑制
@SuppressWarnings("removal")
public class Sample {
	public void sample() {
		//IDEの警告が発生した
		//List list = new ArrayList();
		//list.add("String");
		
		//非推奨メソッドの使用
		new Test().test();
	}
}
