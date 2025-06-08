package chapter8.question3;

public class TestItem {

	public static void main(String[] args) {
		//Itemクラスのクラスリテラルを使って、クラスの定義情報を扱うインスタンスへの参照を取得
		Class<Item> clazz = Item.class;
		
		/*
		 * アノテーションを取得
		 * もし指定したアノテーション（Testアノテーション）がなければnullを返す
		 */
		Test test = clazz.getAnnotation(Test.class);
		
		//nullであれば処理を中断
		if(test == null) {
			return;
		}
		
		String name = test.name();
		int price = test.price();
		
		Item item = new Item(name, price);
		
		System.out.println(item.getName());
		System.out.println(item.getPrice());
	}

}
