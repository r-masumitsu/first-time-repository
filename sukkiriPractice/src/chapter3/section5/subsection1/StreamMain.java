package chapter3.section5.subsection1;

import java.util.ArrayList;
import java.util.List;

import chapter1.section6.Hero;
import chapter1.section6.Sword;

public class StreamMain {
	//戦闘不能な勇者を探す（高階関数の利用）
	public static void main(String[] args) {
		Sword sword = new Sword("はがねの剣");
		Hero hero1 = new Hero("ミナト", 100, sword);
		Hero hero2 = new Hero("アサカ", 0, sword);
		List<Hero> heros = new ArrayList<>();
		heros.add(hero1);
		heros.add(hero2);
		boolean anyoneKnockedOut = heros.stream().anyMatch(h -> h.getHp() == 0);
		System.out.println(anyoneKnockedOut);
	}
}
