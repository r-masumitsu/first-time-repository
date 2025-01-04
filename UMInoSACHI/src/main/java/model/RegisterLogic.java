package model;

import dao.AccountsDAO;

public class RegisterLogic {
	public boolean execute(Account account) {
		String userId = account.getUserId();
		String pass = account.getPass();
		String name = account.getName();
		String address = account.getAddress();
		
		//ユーザーID,パスワード,メールアドレスおよび姓名のどれか一つでもnullもしくは空文字のときはfalseを返す
		if(userId.isBlank() || pass.isBlank() || name.isBlank() || address.isBlank()) {
			return false;
		}
		
		AccountsDAO dao = new AccountsDAO();
		boolean result = dao.insertByRegister(account);
		return result;
	}
}
