package problem7;

public class Calculation {
	//フィールド
	private int number1;
	private int number2;
	
	//ゲッター
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	
	//セッター
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	//メソッド
	public int add() {
		return number1 + number2;
	}
	public int sub() {
		return number1 - number2;
	}
}
