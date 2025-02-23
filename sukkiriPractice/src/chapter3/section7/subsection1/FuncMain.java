package chapter3.section7.subsection1;

public class FuncMain {

	public static void main(String[] args) {
		int point = 70;
		String name = "ミナト"; 
		
		Func1 func1 = new Func1() {
			@Override
			public boolean isOdd(int x) {
				// TODO 自動生成されたメソッド・スタブ
				return (x % 2 == 1);
			}
		};
		Func2 func2 = new Func2() {
			@Override
			public String passCheck(int point, String name) {
				return name + "さんは" + ( point > 65 ? "合格" : "不合格");
			}
		};
		
		System.out.println(point + "は" + (func1.isOdd(point) ? "奇数" : "偶数"));
		System.out.println(func2.passCheck(point, name));
		
	}

}
