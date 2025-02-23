package chapter9.section10;

import java.util.ArrayList;

public class ItemListMain {

	public static void main(String[] args) {
		System.out.println("1円以上のアイテムの一覧表を表示します");
		ArrayList<item> items= ItemsDAO.findByMinimumPrice(6);
		for(item item : items) {
			System.out.printf("%10s%4d%4d", item.getName(), item.getPrice(), item.getWeight());
		}
	}

}
