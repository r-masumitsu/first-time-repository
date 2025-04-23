package com.example.yontaku.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.yontaku.entity.Quiz;

@Mapper
public interface QuizMapper {
	//全てのクイズを取得
	List<Quiz> selectAll();
	
	//指定された作成者のクイズを取得
	List<Quiz> selectByAuthor(@Param("name") String name);
	
	//指定されたクイズを取得
	Quiz selectById(@Param("id") Integer id);

	//クイズを登録
	void insert(Quiz quiz);

	//クイズを更新
	void update(Quiz quiz);

	//指定されたIDのクイズ
	void delete(@Param("id") Integer id);

}
