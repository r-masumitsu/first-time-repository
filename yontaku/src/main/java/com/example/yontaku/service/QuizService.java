package com.example.yontaku.service;

import java.util.List;

import com.example.yontaku.entity.Quiz;

public interface QuizService {
    //全クイズを検索
    List<Quiz> findAllQuiz();
    
    //指定された作成者のクイズを検索
    List<Quiz> findByNameQuiz(String name);

    //指定されたIDのクイズを検索
    Quiz findByIdQuiz(Integer id);

    //クイズを新規登録
    void insertQuiz(Quiz Quiz);

    //クイズを更新
    void updateQuiz(Quiz Quiz);

    //指定されたIDのクイズを削除
    void deleteQuiz(Integer id);
}
