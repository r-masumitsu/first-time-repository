package chapter1.section3;

import java.util.ArrayList;
import java.util.List;

import chapter1.section2.Hero;

public class CollectionEqualsMain {
	public static void main(String[] args) {
		List<Hero> list = new ArrayList<>();
		Hero hero = new Hero("ミナト", 100, 10);
		list.add(hero);
		System.out.println("要素数=" + list.size());
		hero = new Hero("ミナト", 100, 10);
		//Heroクラスはequalsメソッドをオーバーライドしていないので削除されない
		list.remove(hero);
		System.out.println("要素数=" + list.size());
	}
}
