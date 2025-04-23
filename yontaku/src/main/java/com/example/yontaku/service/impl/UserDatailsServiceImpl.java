package com.example.yontaku.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.yontaku.entity.User;
import com.example.yontaku.repository.UserMapper;

import lombok.RequiredArgsConstructor;

/**
* カスタム認証サービス
*/
@Service
@RequiredArgsConstructor
public class UserDatailsServiceImpl implements UserDetailsService {
	/** DI */
	private final UserMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userMapper.selectByUsername(username);
		// 対象データがあれば、UserDetailsの実装クラスを返す
		if (user != null) {
			// 対象データが存在する
			// UserDetailsの実装クラスを返す
			return new UserDetailsImpl(user);
		} else {
			// 対象データが存在しない
			throw new UsernameNotFoundException(
					username + " => 指定しているユーザー名は存在しません");
		}
	}

}