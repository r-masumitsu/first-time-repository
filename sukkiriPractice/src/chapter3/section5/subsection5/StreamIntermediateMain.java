package chapter3.section5.subsection5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import chapter1.section6.Hero;
import chapter1.section6.Sword;

public class StreamIntermediateMain {

	public static void main(String[] args) {
		Sword sword = new Sword("はがねの剣");
		Hero hero1 = new Hero("ミナト", 100, sword);
		Hero hero2 = new Hero("アサカ", 0, sword);
		Hero hero3 = new Hero("タナカ", 0, sword);
		Hero hero4 = new Hero("サトウ", 0, sword);
		Hero hero5 = new Hero("オオタニ", 0, sword);
		List<Hero> heros = new ArrayList<>();
		heros.add(hero1);
		heros.add(hero2);
		heros.add(hero3);
		heros.add(hero4);
		heros.add(hero5);
		
		//勇者の人数を数える
		long all = heros.stream().count();
		System.out.println(all);
		
		//戦闘不能（HP=0）な勇者の人数を数える
		long kockedOut = heros.stream().filter(h -> h.getHp() == 0).count();
		System.out.println(kockedOut);
		
		//戦闘不能（HP=0）な勇者の名前を最大3人分だけ取得する
		List<String> knockedOutNameStrings = heros.stream()
			.filter(h -> h.getHp() == 0)
			.limit(3)
			.map(h -> h.getName())
			.collect(Collectors.toList());
		for(String knockedOutNameString : knockedOutNameStrings) {
			System.out.println(knockedOutNameString);
		}
		
	}

}
