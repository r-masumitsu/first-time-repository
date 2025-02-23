package test.java.chapter14;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;

import main.java.chapter14.Movie;

public class MovieTest {
	@Test
	public void instantiateNoArgs() {
		Movie movie = new Movie();
		movie.setTitle("映画ドラえもん");
		assertEquals("映画ドラえもん", movie.getTitle());

	}

	@Test
	public void instantiateOneArgs() {
		Movie movie = new Movie("猿の惑星");
		assertEquals("猿の惑星", movie.getTitle());
	}

	@Test
	public void getterSetter() throws ParseException {
		Movie movie = new Movie("君の名は");

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");

		movie.setTitle("天気の子");
		movie.setReleaseDate(sdf1.parse("2019/07/19"));

		assertEquals("天気の子", movie.getTitle());
		assertEquals(sdf1.parse("2019/07/19"), movie.getReleaseDate());
	}

	@Test
	public void notNullTitle() {
		Movie movie = new Movie("猿の惑星");
		
		//タイトルにnullをセット（できないはず）
		movie.setTitle(null);
		assertNotNull(movie.getTitle());
	}

	@Test
	public void notNullReleaseDate() throws ParseException {
		Movie movie = new Movie("君の名は");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		movie.setTitle("天気の子");
		movie.setReleaseDate(sdf1.parse("2019/07/19"));
		//公開日にnullをセット（できないはず）
		movie.setReleaseDate(null);
		assertNotNull(movie.getReleaseDate());
	}
	
	@Test
	public void validityReleaseDate() throws ParseException {
		Movie movie = new Movie("君の名は");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		movie.setReleaseDate(sdf1.parse("2019/07/19"));
		movie.setReleaseDate(sdf1.parse("2050/05/05"));
	}
}
