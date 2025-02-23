package chapter2.section5.subsection3;

public class Outer {
	int outerMember = 2;	//非finalメンバ（ただし再代入がなく実質的にfinal）
	void outerMethod() {
		int a = 10;	//非finalローカル変数
		
		//再代入すると、aが暗黙的にfinalではなくなるので、コンパイルエラーになる
		//a = 5;
		
		//メンバ変数に再代入してみた（メンバ変数に関しては、実質的にfinalでなくても問題なし）
		outerMember = 1;
		
		class Inner{
			public void innerMethod() {
				System.out.println("innerMethodです");
				System.out.println(outerMember + a);
			}
		}
		Inner ic = new Inner();
		ic.innerMethod();
	}
}
