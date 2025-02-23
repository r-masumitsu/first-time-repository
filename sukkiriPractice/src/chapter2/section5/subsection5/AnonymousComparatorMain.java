package chapter2.section5.subsection5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import chapter1.section5.Account;

public class AnonymousComparatorMain {
	public static void main(String[] args) {
		Account accountA = new Account(3526846, 1000000);
		Account accountB = new Account(4596325, 1200);
		Account accountC = new Account(1112265, 1145666);
		Account accountD = new Account(5984368, 22500);

		//リストを作って格納
		List<Account> list = new ArrayList<>();
		list.add(accountA);
		list.add(accountB);
		list.add(accountC);
		list.add(accountD);

		System.out.println("並び替え前");
		for (Account account : list) {
			System.out.print("口座番号：");
			System.out.println(account.getNumber());
			System.out.print("残高：");
			System.out.println(account.getZandaka());
		}

		//便利な静的メソッド
		//構文２ 残高順で並び替える
		Collections.sort(list,
				//匿名クラスを使う（この場限りのコンパレータを定義して使い捨てている）
				new Comparator<Account>() {
					public int compare(Account x, Account y) {
						return (x.getZandaka() - y.getZandaka());
					}
				});
		System.out.println();
		System.out.println("残高順並び替え後");
		for (Account account : list) {
			System.out.print("口座番号：");
			System.out.println(account.getNumber());
			System.out.print("残高：");
			System.out.println(account.getZandaka());
		}
	}
}
