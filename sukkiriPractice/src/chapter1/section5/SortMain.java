package chapter1.section5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SortMain {

	public static void main(String[] args) {
		Account accountA = new Account(3526846,1000000);
		Account accountB = new Account(4596325,1200);
		Account accountC = new Account(1112265,1145666);
		Account accountD = new Account(5984368,22500);
		
		//リストを作って格納
		List<Account> list = new  ArrayList<>();
		list.add(accountA);
		list.add(accountB);
		list.add(accountC);
		list.add(accountD);
		
		System.out.println("並び替え前");
		for(Account account : list) {
			System.out.print("口座番号：");
			System.out.println(account.number);
			System.out.print("残高：");
			System.out.println(account.zandaka);
		}
		
		//便利な静的メソッド
		//構文１ 自然順序（口座番号順）で並び替える
		Collections.sort(list);
		System.out.println();
		System.out.println("自然順序並び替え後");
		for(Account account : list) {
			System.out.print("口座番号：");
			System.out.println(account.number);
			System.out.print("残高：");
			System.out.println(account.zandaka);
		}
		
		//便利な静的メソッド
		//構文２ 残高順で並び替える
		Collections.sort(list, new ZandakaComparator());
		System.out.println();
		System.out.println("残高順並び替え後");
		for(Account account : list) {
			System.out.print("口座番号：");
			System.out.println(account.number);
			System.out.print("残高：");
			System.out.println(account.zandaka);
		}
		
		//自然順序（口座番号順）で並び替えるTreeSetを生成
		TreeSet<Account> accounts1 = new TreeSet<>();
		//リストを作って格納
		accounts1.add(accountA);
		accounts1.add(accountB);
		accounts1.add(accountC);
		accounts1.add(accountD);
		System.out.println();
		System.out.println("自然順序（口座番号順）で並び替えるTreeSet");
		for(Account account : accounts1) {
			System.out.print("口座番号：");
			System.out.println(account.number);
			System.out.print("残高：");
			System.out.println(account.zandaka);
		}
		
		//自然順序（口座番号順）で並び替えるTreeSetを生成
		TreeSet<Account> accounts2 = new TreeSet<>(new ZandakaComparator());
		//リストを作って格納
		accounts2.add(accountA);
		accounts2.add(accountB);
		accounts2.add(accountC);
		accounts2.add(accountD);
		System.out.println();
		System.out.println("残高順で並び替えるTreeSet");
		for(Account account : accounts2) {
			System.out.print("口座番号：");
			System.out.println(account.number);
			System.out.print("残高：");
			System.out.println(account.zandaka);
		}
	}

}
