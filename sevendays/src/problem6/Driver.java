package problem6;

public class Driver {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		myCar1.make = "トヨタ"; // 日本語のメーカー名
		myCar1.model = "アクア"; // 日本語のモデル名
		myCar1.color = "白"; // 日本語の色名

		myCar1.run();
		myCar1.run(30);
		myCar1.stop();
	}

}
