package com.example.yontaku.form;

import lombok.Data;

@Data
public class LoginForm {
	/** ユーザー名 */
	private String usernameInput;
	/** パスワード */
	private String passwordInput;
}