package chapter7.question2;

public class Sample1 {

	public static void main(String[] args) {
		//Double型だけを扱うCurrencyのインスタンスを作る
		Currency<Double> currency1 = new Currency<>(7.25);
		System.out.println(currency1.getAmount());
		
		//Integer型だけを扱うCurrencyのインスタンスを作る
		Currency<Integer> currency2 = new Currency<>(100);
		System.out.println(currency2.getAmount());
	}

}
