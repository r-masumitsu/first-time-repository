package com.example.yontaku.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.yontaku.entity.User;

@Mapper
public interface UserMapper {

	/**
	* ユーザー名でログイン情報を取得します。
	*/
	User selectByUsername(String username);
}