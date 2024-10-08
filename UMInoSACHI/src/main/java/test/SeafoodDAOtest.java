package test;

import java.util.ArrayList;

import dao.SeafoodDAO;
import model.Seafood;

public class SeafoodDAOtest {
	public static void main(String[] args) {
		testSelectAllOK(); //ユーザーが見つかる場合のテスト
		testSelectOneByIdOK();
	}

	public static void testSelectAllOK() {
		SeafoodDAO dao = new SeafoodDAO();
		ArrayList<Seafood> result = dao.SelectAll();
		if (result != null) {
			System.out.println("testFindByLoginOK:成功しました");
			for(Seafood seafood : result) {
				System.out.println("レコード：" + seafood.getItemId() + "," + seafood.getName() + "," + seafood.getPrice() + "," + seafood.getImage() );
			}
		} else {
			System.out.println("testFindByLoginOK:失敗しました");
		}
	}
	
	public static void testSelectOneByIdOK() {
		SeafoodDAO dao = new SeafoodDAO();
		Seafood result = dao.SelectOneById("SF001");
		if (result != null) {
			System.out.println("testFindByLoginOK:成功しました");
			System.out.println("レコード：" + result.getItemId() + "," + result.getName() + "," + result.getPrice() + "," + result.getImage() );
		} else {
			System.out.println("testFindByLoginOK:失敗しました");
		}
	}
}
