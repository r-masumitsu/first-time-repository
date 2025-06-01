package chapter7.question16;

public class Item implements Comparable<Item>{
	private String name;
	private int price;
	
	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	//並べ替えのルールを実装
	@Override
	public int compareTo(Item other) {
		//自分自身が相手よりも前に位置するよう並べ替えるのであれば、負の整数を戻す。
		if(this.price < other.price) {
			return -1;
		}
		//自分自身が相手よりも後ろに位置するよう並べ替えるのであれば、正の整数を戻す。
		if(this.price < other.price) {
			return 1;
		}
		return 0;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Item[name=" + name + ", price=" + price + "]";
	}
}
