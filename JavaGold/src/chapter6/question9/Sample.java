package chapter6.question9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sample {
	public static void main(String[] args) {
		final String JDBC_URL = System.getenv("Sample_DATASOURCE_URL");
		final String DB_USER = System.getenv("Sample_DATASOURCE_USERNAME");
		final String DB_PASS = System.getenv("Sample_DATASOURCE_PASSWORD");
		
		//データの挿入
		String sql1 = "insert into item values(?, ?)";
		
		//データの更新
		String sql2 = "update item set name = ?";

		//JDBCドライバを読み込む
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした");
		}

		//データベースへ接続
		try (Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);
				PreparedStatement ps1 = con.prepareStatement(sql1);
				PreparedStatement ps2 = con.prepareStatement(sql2);) {
			//データの挿入
			ps1.setInt(1, 2);
			ps1.setString(2, "sample");
			int result1 = ps1.executeUpdate();
			System.out.println(result1 + "件挿入しました");
			//データの更新
			ps2.setString(1, "hoge");
			ps2.executeUpdate();
			int result2 = ps2.executeUpdate();
			System.out.println(result2 + "件更新しました");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
