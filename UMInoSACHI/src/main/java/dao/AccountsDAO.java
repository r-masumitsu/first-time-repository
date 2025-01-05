package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Account;
import model.Login;

public class AccountsDAO {
	private final String JDBC_URL = System.getenv("UMInoSACHI_DATASOURCE_URL");
	private final String DB_USER = System.getenv("UMInoSACHI_DATASOURCE_USERNAME");
	private final String DB_PASS = System.getenv("UMInoSACHI_DATASOURCE_PASSWORD");

	//ログイン処理における検索
	public Account findByLogin(Login login) {
		Account account = null;
		//JDBCドライバを読み込む
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした");
		}
		//データベースへ接続
		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			//SELECT文を準備
			String sql = "SELECT USER_ID, PASS, NAME, ADDRESS, IS_ADMIN FROM ACCOUNTS WHERE USER_ID = ? AND PASS = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, login.getUserId());
			pStmt.setString(2, login.getPass());

			ResultSet rs = pStmt.executeQuery();

			if (rs.next()) {
				//ユーザーが存在したらデータを取得
				//そのユーザーを表すAccountインスタンスを生成
				String userId = rs.getString("USER_ID");
				String pass = rs.getString("PASS");
				String name = rs.getString("NAME");
				String address = rs.getString("ADDRESS");
				Boolean isAdmin = rs.getBoolean("IS_ADMIN");
				account = new Account(userId, pass, name, address, isAdmin);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			account = null;
		}
		return account;
	}

	//アカウント情報登録
	public boolean insertByRegister(Account account) {
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
			String sql = "INSERT INTO ACCOUNTS VALUES (?, ?, ?, ?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, account.getUserId());
			pStmt.setString(2, account.getPass());
			pStmt.setString(3, account.getName());
			pStmt.setString(4, account.getAddress());
			pStmt.setBoolean(5, account.isAdmin());
			int rowsAffected = pStmt.executeUpdate();
			result = (rowsAffected == 1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
