package chapter5.question10;

import java.io.Serializable;

//シリアライズ対象のクラスはjava.io.Serializableインタフェースを実装しなくてはいけない
public class Item implements Serializable{
	private String name;
	private int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
}
