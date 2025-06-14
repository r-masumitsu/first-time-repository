package chapter9.question11;

public class Item {
	private String name;
	private int price;

	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		
		//不変条件の確認
		assert this.name != null : "name is null";
		assert price > 0 : "invalid price : " + price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
