package model;

public class Seafood {
	private String itemId;
	private String name;
	private int price;
	private String image;
	public Seafood(String itemId, String name, int price, String image) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.image = image;
	}
	public String getItemId() {
		return itemId;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getImage() {
		return image;
	}
}
