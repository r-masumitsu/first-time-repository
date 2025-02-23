package chapter9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//（参照系）JDBC操作
public class SelectSQLMain {

	public static void main(String[] args) {
		
		//STEP0：事前準備（JAR配置を含む）
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			//JDBCドライバが見つからない場合の処理
			throw new IllegalStateException("ドライバのロードに失敗しました");
		}
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//STEP 1：データベースの接続
			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/rpgdb","sa","");
			//STEP 2：SQL送信処理
			//STEP 2-①-1 送信すべきSQL文のひな形を準備
			pstmt = con.prepareStatement("SELECT * FROM MONSTERS WHERE HP >= ?");
			//STEP 2-①-2 ひな形に値を流し込みSQL文を組み立てる
			//※パラメータ番号は1から始まることに注意
			pstmt.setInt(1, 4);
			//STEP 2-①-3 組み立て終えたSQL文をDBMSに送信する
			ResultSet rs = pstmt.executeQuery();
			//STEP 2-①-4 結果表を処理する
			while (rs.next()) {
				System.out.println(rs.getString("NAME"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//STEP3：データベース接続の切断
			if(con != null) {
				try {
					pstmt.close();
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		
	}

}
