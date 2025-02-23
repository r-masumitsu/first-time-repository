package main.java.chapter14;

import java.util.Date;

public class Movie {
	//タイトル
	private String title;
	//公開日
	private Date releaseDate;

	//引数なしのコンストラクタ
	public Movie() {
	}

	//タイトルのみをセットするコンストラクタ
	public Movie(String title) {
		this.title = title;
	}

	//ゲッターセッター
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		//引数がnullのときはセットしない
		if (title != null) {
			this.title = title;
		}
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		//引数がnullのときはセットしない
		if (releaseDate != null && releaseDate.before(new Date())) {
			this.releaseDate = releaseDate;
		}
	}

}
