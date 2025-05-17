package chapter2.question4;

import java.util.function.Consumer;

//ビルダーを持つItemクラス
public class Item {
	private int id;
	private String name;
	private int price;

	private Item(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.price = builder.price;
	}

	@Override
	public String toString() {
		return "Item[id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public static class Builder {
		private int id;
		public String name;
		public int price;

		public Builder(int id) {
			this.id = id;
		}

		public Builder with(Consumer<Builder> consumer) {
			consumer.accept(this);
			return this;
		}

		public Item build() {
			return new Item(this);
		}
	}
}
