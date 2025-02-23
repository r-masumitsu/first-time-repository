package chapter15.section7;

public class SingletonFlower {
	//唯一のインスタンス保存用
	private static SingletonFlower theInstance;
	
	//privateなコンストラクタ
	private SingletonFlower() {}
	
	//インスタンス取得用メソッド
	public static SingletonFlower getInstance() {
		if(theInstance == null) {
			theInstance = new SingletonFlower();
		}
		return theInstance;
	}
}
