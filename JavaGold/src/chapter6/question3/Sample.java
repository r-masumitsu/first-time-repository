package chapter6.question3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample {
	
	public static void main(String[] args) {
		final String JDBC_URL = System.getenv("Sample_DATASOURCE_URL");
		final String DB_USER = System.getenv("Sample_DATASOURCE_USERNAME");
		final String DB_PASS = System.getenv("Sample_DATASOURCE_PASSWORD");
		
		//JDBCドライバを読み込む
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした");
		}
		
		//データベースへ接続
		try {
			Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);
			//Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)；
			
			System.out.println(con);
			System.out.println("接続完了");
			con.close();
 		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
