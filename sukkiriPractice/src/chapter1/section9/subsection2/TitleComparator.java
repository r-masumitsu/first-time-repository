package chapter1.section9.subsection2;

import java.util.Comparator;

import chapter1.section9.subsection1.Book;

public class TitleComparator implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
		return book1.getTitle().compareTo(book2.getTitle());
	}
	
}
