package com.example.yontaku.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.yontaku.entity.Quiz;
import com.example.yontaku.repository.QuizMapper;
import com.example.yontaku.service.QuizService;

import lombok.RequiredArgsConstructor;

/**
 * Quiz：サービス実装クラス
 */
@Service
@Transactional
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {

	/** DI */
	private final QuizMapper QuizMapper;

	@Override
	public List<Quiz> findAllQuiz() {
		return QuizMapper.selectAll();
	}

	@Override
	public List<Quiz> findByNameQuiz(String name) {
		return QuizMapper.selectByAuthor(name);
	}
	
	@Override
	public Quiz findByIdQuiz(Integer id) {
		return QuizMapper.selectById(id);
	}

	@Override
	public void insertQuiz(Quiz Quiz) {
		QuizMapper.insert(Quiz);
	}

	@Override
	public void updateQuiz(Quiz Quiz) {
		QuizMapper.update(Quiz);
	}

	@Override
	public void deleteQuiz(Integer id) {
		QuizMapper.delete(id);
	}
}
