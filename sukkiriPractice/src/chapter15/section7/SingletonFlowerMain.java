package chapter15.section7;

public class SingletonFlowerMain {

	public static void main(String[] args) {
		//コンパイルエラー（コンストラクタがprivateになっているのでインスタンス化できない）
		//SingletonFlower flowerRed = new SingletonFlower();

		//staticメソッドを使ってインスタンス化できる
		SingletonFlower flowerBlue = SingletonFlower.getInstance();
	}

}
