package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import model.User;

public class UserDAO {
	private final String JDBC_URL = System.getenv("UMInoSACHI_DATASOURCE_URL");
	private final String DB_USER = System.getenv("UMInoSACHI_DATASOURCE_USERNAME");
	private final String DB_PASS = System.getenv("UMInoSACHI_DATASOURCE_PASSWORD");

	//ログイン処理における検索
	public User findByLogin(User user) {
		User loginUser = null;
		//JDBCドライバを読み込む
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした");
		}
		//データベースへ接続
		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			//SELECT文を準備
			String sql = "SELECT id, name, email, password, created_at FROM users WHERE email = ? AND password = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, user.getEmail());
			pStmt.setString(2, user.getPassword());

			ResultSet rs = pStmt.executeQuery();

			if (rs.next()) {
				//ユーザーが存在したらデータを取得
				//そのユーザーを表すuserインスタンスを生成
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String password = rs.getString("password");
				LocalDate created_at = rs.getObject("created_at", LocalDate.class);
				user = new User(id, name, email, password, created_at);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			user = null;
		}
		return loginUser;
	}

	//アカウント情報登録
	public boolean insertByRegister(User user) {
		boolean result = false;
		//JDBCドライバを読み込む
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした");
		}
		//データベースへ接続
		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			//INSERT文を準備
			String sql = "INSERT INTO users SET name=?, email=?, password=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, user.getName());
			pStmt.setString(2, user.getEmail());
			pStmt.setString(3, user.getPassword());
			int rowsAffected = pStmt.executeUpdate();
			result = (rowsAffected == 1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
