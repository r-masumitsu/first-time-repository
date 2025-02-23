package chapter1.section9.subsection3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import chapter1.section9.subsection1.Book;
import chapter1.section9.subsection2.TitleComparator;

public class Main {

	public static void main(String[] args) {
		Book book1 = new Book("Java入門", new Date(111, 9, 7), "スッキリわかる");
		Book book2 = new Book("Python入門", new Date(119, 5, 11), "カレーが食べたくなる");
		Book book3 = new Book("C言語入門", new Date(118, 5, 21), "ポインタも自由自在");
		//リスト
		ArrayList<Book> bookList = new ArrayList<>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		//発行日のフォーマット設定
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy'年'MM'月'dd'日'");
		
		//リストの中身を表示
		System.out.println("リストの中身（並び替え前）");
		for (Book book : bookList) {
			System.out.println("タイトル：" + book.getTitle());
			System.out.println("発行日：" + simpleDateFormat.format(book.getPublishDate()));
			System.out.println("コメント：" + book.getComment());
		}
		//並び替え実行
		Collections.sort(bookList, new TitleComparator());
		System.out.println();
		
		//リストの中身を表示
		System.out.println("リストの中身（並び替え後）");
		for (Book book : bookList) {
			System.out.println("タイトル：" + book.getTitle());
			System.out.println("発行日：" + simpleDateFormat.format(book.getPublishDate()));
			System.out.println("コメント：" + book.getComment());
		}
	}
}
