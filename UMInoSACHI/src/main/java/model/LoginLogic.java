package model;

import dao.UserDAO;

//アカウント情報を戻すように変更
public class LoginLogic {
	public User execute(User user) {
		UserDAO dao = new UserDAO();
		user = dao.findByLogin(user);
		return user;
	}
}
