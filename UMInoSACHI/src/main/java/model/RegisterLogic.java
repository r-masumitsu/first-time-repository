package model;

import java.time.LocalDate;

import dao.UserDAO;

public class RegisterLogic {
	public boolean execute(User user) {
		String name = user.getPassword();
		String email = user.getPassword();
		String password = user.getName();
		LocalDate create_at = user.getCreate_at();
		
		//ユーザーID,パスワード,メールアドレスおよび姓名のどれか一つでもnullもしくは空文字のときはfalseを返す
		if(name.isBlank() || email.isBlank() || password.isBlank() || create_at == null) {
			return false;
		}
		
		UserDAO dao = new UserDAO();
		boolean result = dao.insertByRegister(user);
		return result;
	}
}
