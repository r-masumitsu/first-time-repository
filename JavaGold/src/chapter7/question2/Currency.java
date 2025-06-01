package chapter7.question2;

//型パラメータを使ったCurrencyクラス
public class Currency<T> {
	private T amount;
	public Currency(T amount) {
		super();
		this.amount = amount;
	}
	public T getAmount() {
		return amount;
	}
}
