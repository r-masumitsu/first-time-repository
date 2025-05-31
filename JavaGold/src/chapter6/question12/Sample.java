package chapter6.question12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
		try (Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);
				PreparedStatement ps = con.prepareStatement(args[0]);) {
			
			//コマンドライン引数で受け取ったSQLが参照系でない（挿入・更新・削除）場合、更新件数を表示する
			if(ps.execute() == false) {
				System.out.println(ps.getUpdateCount() + "件挿入・更新・削除しました");
				return;
			}
			
			ResultSet rs = ps.getResultSet();
			
			//結果表のメタデータを取り出す
			ResultSetMetaData meta = rs.getMetaData();
			
			//結果表が何列あるか調べる
			int colSize = meta.getColumnCount();
			
			//各行の各列のデータを表示
			System.out.println("以下にデータを表示します");
			while(rs.next()) {
				for(int i = 1; i <= colSize; i++) {
					System.out.println(rs.getString(i));
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
