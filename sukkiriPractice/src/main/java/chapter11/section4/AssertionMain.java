package main.java.chapter11.section4;

public class AssertionMain {

	public static void main(String[] args) {
		System.out.println("アサートにわざと失敗します");
		assert 1 == 0;
		System.out.println("正常終了します");
	}

}
