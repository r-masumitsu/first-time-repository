package chapter2.question4;

public class Sample {

	public static void main(String[] args) {
		Item item = new Item.Builder(100)
				.with(b -> {
					b.name = "orange";
					b.price = 120;
				}).build();
		System.out.println(item);
	}

}
