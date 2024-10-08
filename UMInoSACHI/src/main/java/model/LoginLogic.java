package model;

import dao.AccountsDAO;

//アカウント情報を戻すように変更
public class LoginLogic {
	public Account execute(Login login) {
		AccountsDAO dao = new AccountsDAO();
		Account account = dao.findByLogin(login);
		return account;
	}
}
