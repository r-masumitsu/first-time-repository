package chapter9.question11;

//-eaオプションをつけて実行する
public class Main {

	public static void main(String[] args) {
		String name = args[0];
		int price = Integer.parseInt(args[1]);
		double qty = Double.parseDouble(args[2]);
		
		Item item = new Item(name, price);
		Order order = new Order(item, qty);
		
		//事後条件の確認
		assert order.getPrice() == (int)(price * qty) : "invalid result getPrice()";
		
		System.out.println("total price : " + order.getPrice());
	}

}
