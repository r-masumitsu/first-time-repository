package chapter7.section2.subsection3;

public class SplitMain {
	//String.split()を使った文字列の分割
	public static void main(String[] args) {
		String str = "ミナト,アサカ,スガワラ";
		String[] strArray = str.split(",");
		for(String t : strArray) {
			System.out.println(t);
		}
	}

}
