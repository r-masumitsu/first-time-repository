package chapter2.section2;

public class Pocket<E> {
	//フィールド
	private E data;
	//メソッド
	public void put(E d) {
		this.data = d;
	}
	public E get() {
		return this.data;
	}
}
