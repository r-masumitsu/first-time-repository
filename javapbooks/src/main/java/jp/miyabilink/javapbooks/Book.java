package jp.miyabilink.javapbooks;

import java.util.Date;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

//chapter1.section9.subsection1のBookクラスを、「書籍と発行日とコメントが同じであれば等価なものと判定され」るように改変
//commons-langに含まれる、HashCodeBuilderクラス、EqualsBuilderクラス、CompareToBuilderクラスを利用する
public class Book implements Comparable<Book>, Cloneable{
	//フィールド
	private String title;
	private Date publishDate;
	private String comment;
	
	//コンストラクタ
	public Book(String title, Date publishDate, String comment) {
		super();
		this.title = title;
		this.publishDate = publishDate;
		this.comment = comment;
	}
	
	//ゲッターセッター
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
	public boolean equals(Object object) {
		//この一行だけで、「全てのフィールドが等価ならインスタンスも等価と見なす」機能を一行で実現できる
		return EqualsBuilder.reflectionEquals(this, object);
	}
	
	@Override
	public int hashCode() {
		//この一行だけで、HashBankクラスの全フィールドからハッシュ値を生成できる
		return HashCodeBuilder.reflectionHashCode(this);
	}
	
	@Override
	public int compareTo(Book book) {
		return CompareToBuilder.reflectionCompare(this, book, "title", "title");
	}
	
	@Override
	public Book clone() {	//深いコピーにするためにthis.publishDate.clone()を使う
		Book result = new Book(this.title, (Date)this.publishDate.clone(), this.comment);
		return result;
	}
}
