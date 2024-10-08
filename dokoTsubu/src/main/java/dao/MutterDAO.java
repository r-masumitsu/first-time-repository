package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Mutter;

public class MutterDAO {
	//データベース接続に関する情報
	private final String JDBC_URL = "jdbc:h2:tcp://localhost/~/dokoTsubu";
	private final String DB_USER = "sa";
	private final String DB_PASS = "";
	
	public List<Mutter> findAll(){
		List<Mutter> mutterList = new ArrayList<>();
		//JDBCドライバを読み込む
		try {
			Class.forName("org.h2.Driver");
		}catch (ClassNotFoundException e){
			throw new IllegalStateException("JDBCドライバを読み込めませんでした");
		}
		//データベース接続
		try(Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)){
			//SELECT文の準備
			String sql = "SELECT * FROM MUTTERS ORDER BY ID DESC\n"
					+ "";	//IDの大きい順に検索結果を並べる
			PreparedStatement pStmt = conn.prepareStatement(sql);
			
			//SELECTを実行
			ResultSet rs = pStmt.executeQuery();
			
			//SELECT文の結果をArrayListに格納
			while(rs.next()) {
				int id = rs.getInt("ID");
				String userName = rs.getString("NAME");
				String text = rs.getString("TEXT");
				Mutter mutter = new Mutter(id, userName, text);
				mutterList.add(mutter);
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return mutterList;
	}
	
	public boolean create(Mutter mutter) {
		//JDBCドライバを読み込む
		try {
			Class.forName("org.h2.Driver");
		}catch(ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした");
		}
		//データベース接続
		try(Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)){
			
			//INSERT文の準備（idは自動連番なので設定しなくてよい）
			String sql = "INSERT INTO MUTTERS(NAME, TEXT) VALUES(?, ?)";
			PreparedStatement pSmt = conn.prepareStatement(sql);
			
			//INSERT文中の「?」に使用する値を設定してSQL文を完成
			pSmt.setString(1,mutter.getUserName());
			pSmt.setString(2,mutter.getText());
			
			//INSERT文を実行
			int result = pSmt.executeUpdate();
			if(result != 1) {
				return false;
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}

