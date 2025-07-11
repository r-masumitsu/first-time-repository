package chapter10.question4;

//Itemのインスタンスを作るクラス
public class Main {

	public static void main(String[] args) {
		Item a = new Item.Builder()
				.setName("sample")
				.build();
		System.out.println(a.getName());
	}

}
