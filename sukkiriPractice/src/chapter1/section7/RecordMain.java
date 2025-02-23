package chapter1.section7;

public class RecordMain {

	public static void main(String[] args) {
		LoginHistory loginHistory = new LoginHistory("USER1", 0, true);
		System.out.println("ログインを試みたユーザー名は" + loginHistory.user());
	}

}
