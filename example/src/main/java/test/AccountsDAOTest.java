package test;

import dao.AccountsDAO;
import model.Account;
import model.Login;

public class AccountsDAOTest {

	public static void main(String[] args) {
		testFindByLoginOK(); //ユーザーが見つかる場合のテスト
		testFindByLoginNG(); //ユーザーが見つからない場合のテスト
		testInsertByRegisterOK();
	}

	public static void testFindByLoginOK() {
		Login login = new Login("minato", "1234");
		AccountsDAO dao = new AccountsDAO();
		Account result = dao.findByLogin(login);
		if (result != null &&
				result.getUserId().equals("minato") &&
				result.getPass().equals("1234") &&
				result.getMail().equals("yusuke.minato@miyabilink.jp") &&
				result.getName().equals("湊 雄輔") &&
				result.getAge() == 23) {
			System.out.println("testFindByLoginOK:成功しました");
		} else {
			System.out.println("testFindByLoginOK:失敗しました");
		}
	}

	public static void testFindByLoginNG() {
		Login login = new Login("minato", "12345");
		AccountsDAO dao = new AccountsDAO();
		Account resultAccount = dao.findByLogin(login);
		if (resultAccount == null) {
			System.out.println("testFindByLoginNG:成功しました");
		} else {
			System.out.println("testFindByLoginNG:失敗しました");
		}
	}

	//２回目以降は失敗する（IDの重複が許されないから）
	public static void testInsertByRegisterOK() {
		Account account = new Account("ayabe", "5678", "megumi.ayabe@miyabilink.jp", "綾部 めぐみ", 22);
		AccountsDAO dao = new AccountsDAO();
		Boolean result = dao.insertByRegister(account);
		if (result) {
			System.out.println("testInsertByRegisterOK:成功しました");
		} else {
			System.out.println("testFindByLoginNG:失敗しました");
		}
	}
}
