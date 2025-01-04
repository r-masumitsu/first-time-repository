package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Seafood;


public class SeafoodDAO {
	private final String JDBC_URL = System.getenv("UMInoSACHI_DATASOURCE_URL");
	private final String DB_USER = System.getenv("UMInoSACHI_DATASOURCE_USERNAME");
	private final String DB_PASS = System.getenv("UMInoSACHI_DATASOURCE_PASSWORD");

	//全件取得
	public ArrayList<Seafood> SelectAll() {
		Seafood seafood;
		ArrayList<Seafood> seafoodList= new ArrayList<>();
		//JDBCドライバを読み込む
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした");
		}
		//データベースへ接続
		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			//SELECT文を準備
			String sql = "SELECT * FROM SEAFOOD";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) {
				String itemId = rs.getString("ITEM_ID");
				String name = rs.getString("NAME");
				int price = rs.getInt("PRICE");
				String image = rs.getString("IMAGE");
				seafood = new Seafood(itemId, name, price,image);
				seafoodList.add(seafood);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			seafoodList = null;
		}
		return seafoodList;
	}

	//IDで一件取得
	public Seafood SelectOneById(String id) {
		Seafood seafood = null;
		//JDBCドライバを読み込む
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした");
		}
		//データベースへ接続
		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			//SELECT文を準備
			String sql = "SELECT * FROM SEAFOOD WHERE ITEM_ID = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, id);
			ResultSet rs = pStmt.executeQuery();
			
			if (rs.next()) {
				String itemId = rs.getString("ITEM_ID");
				String name = rs.getString("NAME");
				int price = rs.getInt("PRICE");
				String image = rs.getString("IMAGE");
				seafood = new Seafood(itemId, name, price,image);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			seafood = null;
		}
		return seafood;
	}
}
