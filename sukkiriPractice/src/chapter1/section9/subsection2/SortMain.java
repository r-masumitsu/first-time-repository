package chapter1.section9.subsection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import chapter1.section9.subsection1.Book;

public class SortMain {
	public static void main(String[] args) {
		Book book1 = new Book("桃太郎", new Date(1800, 11, 10), "どんぶらこどんぶらこ");
		Book book2 = new Book("猿蟹合戦", new Date(1850, 9, 9), "ケニー");
		Book book3 = new Book("聖書", new Date(100, 8, 8), "イエス");
		Book book4 = new Book("PEANUTS", new Date(1950, 10, 2), "BUNG!");
		Book book5 = new Book("聖書", new Date(100, 8, 8), "イエス");

		//リスト
		ArrayList<Book> bookList = new ArrayList<>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		bookList.add(book5);

		//リストの中身を表示
		System.out.println("リストの中身（並び替え前）");
		for (Book book : bookList) {
			System.out.println(book.getTitle());
		}
		//並び替え実行
		Collections.sort(bookList, new TitleComparator());
		//リストの中身を表示
		System.out.println("リストの中身（並び替え後）");
		for (Book book : bookList) {
			System.out.println(book.getTitle());
		}
	}
}
