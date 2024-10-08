package test;

import model.Account;
import model.RegisterLogic;

public class RegisterLogicTest {

	public static void main(String[] args) {
		testExecuteOK();
	}
	
	//２回目以降は失敗する（IDの重複が許されないから）
	public static void testExecuteOK() {
		Account account = new Account("ayabe", "5678", "megumi.ayabe@miyabilink.jp", "綾部 めぐみ", 22);
		RegisterLogic bo = new RegisterLogic();
		boolean result = bo.execute(account);
		if (result) {
			System.out.println("testInsertByRegisterOK:成功しました");
		} else {
			System.out.println("testFindByLoginNG:失敗しました");
		}
	}
}
