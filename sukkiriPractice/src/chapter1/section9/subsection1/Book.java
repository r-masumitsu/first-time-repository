package chapter1.section9.subsection1;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable{
	private String title;
	private Date publishDate;
	private String comment;
	
	public Book(String title, Date publishDate, String comment) {
		super();
		this.title = title;
		this.publishDate = publishDate;
		this.comment = comment;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public boolean equals(Object obj) {
		Book book = (Book)obj;
		if((this.title.equals(book.title)) && (this.publishDate.equals(book.publishDate))) {
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.title, this.publishDate, this.comment);
	}
	
	@Override
	public int compareTo(Book book) {
		return this.publishDate.compareTo(book.publishDate);
	}
	
	public Book clone() {	//深いコピーにするためにthis.publishDate.clone()を使う
		Book result = new Book(this.title, (Date)this.publishDate.clone(), this.comment);
		return result;
	}
}
