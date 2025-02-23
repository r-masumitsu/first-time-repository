package chapter1.section9.subsection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;

public class SetListMain {

	public static void main(String[] args) {
		Book book1 = new Book("桃太郎", new Date(1800,11,10), "どんぶらこどんぶらこ");
		Book book2 = new Book("猿蟹合戦", new Date(1850,9,9), "ケニー");
		Book book3 = new Book("聖書", new Date(100,8,8), "イエス");
		Book book4 = new Book("PEANUTS", new Date(1950,10,2), "BUNG!");
		Book book5 = new Book("聖書", new Date(100,8,8), "イエス");
		
		//セット
		HashSet<Book> bookSet = new HashSet<>();
		bookSet.add(book1);
		bookSet.add(book2);
		bookSet.add(book3);
		bookSet.add(book4);
		
		//リスト
		ArrayList<Book> bookList = new ArrayList<>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		bookList.add(book5);
		
		//①書籍と発行日が同じであれば等価なものと判定され、かつ、HashSetなどに格納しても正しく利用できる。
		//セットの中身を表示
		System.out.println("セットの中身（削除前）");
		for(Book book : bookSet) {
			System.out.println(book.getTitle());
		}
		//聖書を削除
		bookSet.remove(book5);
		//セットの中身を表示
		System.out.println("セットの中身（削除後）");
		for(Book book : bookSet) {
			System.out.println(book.getTitle());
		}
		
		//②発行日が古い順を自然順序とする。
		//リストの中身を表示
		System.out.println("リストの中身（並び替え前）");
		for(Book book : bookList) {
			System.out.println(book.getTitle());
		}
		//並び替え実行
		Collections.sort(bookList);
		//リストの中身を表示
		System.out.println("リストの中身（並び替え後）");
		for(Book book : bookList) {
			System.out.println(book.getTitle());
		}
		
		//③cloneを呼び出すと、深いコピーによる複製が行われる。
		Book cloneBook = book1.clone();
		book1.setComment("鬼に金棒");
		book1.setPublishDate(new Date(900,2,2));
		//確認
		System.out.println("元のオブジェクトの発行日：" + book1.getPublishDate());
		System.out.println("元のオブジェクトのコメント：" + book1.getComment());
		System.out.println("クローンのオブジェクトの発行日：" + cloneBook.getPublishDate());
		System.out.println("クローンのオブジェクトのコメント：" + cloneBook.getComment());
	}

}
