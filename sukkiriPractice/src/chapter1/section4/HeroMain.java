package chapter1.section4;

import java.util.HashSet;
import java.util.Set;

public class HeroMain {

	public static void main(String[] args) {
		Set<Hero> list = new HashSet<>();
		Hero hero1 = new Hero();
		hero1.name = "ミナト";
		list.add(hero1);
		System.out.println("要素数" + list.size());
		Hero hero2 = new Hero();
		hero2.name = "ミナト";
		list.remove(hero2);
		System.out.println("要素数" + list.size());

	}

}
