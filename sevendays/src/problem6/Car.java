package problem6;

class Car {
	// フィールド
	String make; // メーカー
	String model; // モデル
	String color; // 色

	// メソッド: 車を走らせる
	void run() {
		System.out.println(color + "の " + make + " " + model + " が走り始めました。");
	}

	// メソッド: 車を指定された速度で走らせる（オーバーロード）
	void run(int speed) {
		System.out.println(color + "の " + make + " " + model + " が" + speed + "km/hで走り始めました。");
	}

	// メソッド: 車を止める
	void stop() {
		System.out.println(color + "の " + make + " " + model + " が止まりました。");
	}
}
