package chapter1.section9.subsection4;

import java.util.ArrayList;

public class MonstersMain {

	public static void main(String[] args) {
		//モンスターを格納するリストを作成
		ArrayList<Monster> monsters = new ArrayList<>();
		
		try {
			Monster monster1 = new Monster("ピカチュウ", 50, false);
			monsters.add(monster1);
			Monster monster2 = new Monster("デカチュウ", 160, true);
			monsters.add(monster2);
			Monster monster3 = new Monster("チビチュウ", -10, false);
			monsters.add(monster3);
		} catch (Exception e) {
			System.out.println("例外をキャッチしました");
			System.out.println();
		}finally {
			for(Monster monster : monsters) {
				System.out.println("名前：" + monster.name());
				System.out.println("HP：" + monster.hp());
				System.out.println("ボスモンスター：" + monster.isBoss());
				System.out.println();
			}
		}
	}
}
