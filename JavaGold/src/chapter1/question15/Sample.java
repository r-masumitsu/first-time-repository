package chapter1.question15;

public class Sample {

	public static void main(String[] args) {
		int number = 0;
		Fruits type = Fruits.APPLE; 
		
		//数字の意味が読んでも理解できないことが問題点
		//所謂マジックナンバー
		System.out.println("定数リテラルを使って分岐処理を行う");
		switch(number) {
			case 0:
				System.out.println("apple");
				break;
			case 1:
				System.out.println("orange");
				break;
			case 2:
				System.out.println("banana");
				break;
		}
		
		//数値で分岐したコードよりも、何を意味しているかが理解しやすくなる
		System.out.println("インタフェースに定義した定数を使って分岐処理を行う");
		switch(number) {
			case ItfFruits.APPLE:
				System.out.println("apple");
				break;
			case ItfFruits.ORANGE:
				System.out.println("orange");
				break;
			case ItfFruits.BANANA:
				System.out.println("banana");
				break;
		}
		//プログラムの制御は定数名ではなく定数値で行うため、定数値重複のバグが生まれうる
		if(number == ItfFruits.MELON) {
			System.out.println("joke?");
		}
		
		//switch文の仮引数の値が定数名なのでさらに可読性が上がる
		System.out.println("Enum使って分岐処理を行う");
		switch(type) {
			case Fruits.APPLE:
				System.out.println("apple");
				break;
			case Fruits.ORANGE:
				System.out.println("orange");
				break;
			case Fruits.BANANA:
				System.out.println("banana");
				break;
			case Fruits.MELON:
				System.out.println("melon");
				break;
		}
		//プログラムの制御は定数名で行うため、バグが生まれにくい
		if(type == Fruits.MELON) {
			System.out.println("joke?");
		}else {
			System.out.println("not joke");
		}
	}

}
