package chapter9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//（更新(追加)系）JDBC操作
public class transactionSQLMain {

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
			//手動コミットモードに切替
			con.setAutoCommit(false);
			//STEP 2：SQL送信処理
			//STEP 2-①-1 送信すべきSQL文のひな形を準備
			pstmt = con.prepareStatement("UPDATE MONSTERS SET HP = ? WHERE NAME = ?");
			//STEP 2-①-2 ひな形に値を流し込みSQL文を組み立てる
			//※パラメータ番号は1から始まることに注意
			pstmt.setInt(1, 7);
			pstmt.setString(2, "ゾンビ");
			//STEP 2-①-3 組み立て終えたSQL文をDBMSに送信する
			int r = pstmt.executeUpdate();	//変更された行数が返る
			//STEP 2-①-4 処理結果を判定する
			if(r != 0) {
				System.out.println(r + "件のモンスターを更新しました");
			}else {
				System.out.println("更新しませんでした");
			}
			//コミット
			con.commit();
			try {
				//ロールバック
				con.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			System.out.println("データベース接続で例外が発生しました");
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
