package problemex1;

public class Problemex1_3 {

	//四角形を出力するメソッド
	private static void square(int vertical, int beside) {
		for (int i = 0; i < vertical; i++) {
			for (int j = 0; j < beside; j++) {
				System.out.print("◼︎");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		//乱数を作る
		int ramdomNumber1 = (int) (Math.random() * 10) + 1;
		int ramdomNumber2 = (int) (Math.random() * 10) + 1;

		//乱数を表示
		System.out.println("たて：" + ramdomNumber1);
		System.out.println("よこ：" + ramdomNumber2);

		//メソッド実行
		square(ramdomNumber1, ramdomNumber2);

	}

}
