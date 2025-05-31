package chapter6.question4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sample {
	public static void main(String[] args) {
		final String JDBC_URL = System.getenv("Sample_DATASOURCE_URL");
		final String DB_USER = System.getenv("Sample_DATASOURCE_USERNAME");
		final String DB_PASS = System.getenv("Sample_DATASOURCE_PASSWORD");

		String sql = "select * from item where id = ?";

		//JDBCドライバを読み込む
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした");
		}

		//データベースへ接続
		try (Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);
				PreparedStatement ps = con.prepareStatement(sql);) {
			for(String id : args) {
				ps.setInt(1, Integer.parseInt(id));
				try(ResultSet rs = ps.executeQuery()){
					while(rs.next()) {
						System.out.println(rs.getString("name"));
					}
				}
			}
			
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
