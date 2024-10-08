package test;

import model.Account;
import model.Login;
import model.LoginLogic;

public class LoginLogicTest {

	public static void main(String[] args) {
		testExecuteOK();	//ログイン成功のテスト
		testExecuteNG();	//ログイン失敗のテスト
	}
	
	public static void testExecuteOK() {
		Login login = new Login("minato", "1234");
		LoginLogic bo = new LoginLogic();
		Account account = bo.execute(login);
		if(account != null) {
			System.out.println("testExecuteOK:成功しました");
		}else {
			System.out.println("testExecuteOK:失敗しました");
		}
	}
	public static void testExecuteNG() {
		Login login = new Login("minato", "12345");
		LoginLogic bo = new LoginLogic();
		Account account = bo.execute(login);
		if(account == null) {
			System.out.println("testExecuteNG:成功しました");
		}else {
			System.out.println("testExecuteNG:失敗しました");
		}
	}

}
