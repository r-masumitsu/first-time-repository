package com.example.yontaku.helper;

import com.example.yontaku.entity.Quiz;
import com.example.yontaku.form.QuizForm;

public class QuizHelper {
	/**
	 * Quizへの変換
	 */
	public static Quiz convertQuiz(QuizForm form) {
		Quiz Quiz = new Quiz();
		Quiz.setQuiz_id(form.getQuiz_id());
		Quiz.setQuestion(form.getQuestion());
		Quiz.setOption1(form.getOption1());
		Quiz.setOption2(form.getOption2());
		Quiz.setOption3(form.getOption3());
		Quiz.setOption4(form.getOption4());
		Quiz.setAnswer(form.getAnswer());
		Quiz.setAuthor_name(form.getAuthor_name());
		Quiz.setGenre(form.getGenre());
		Quiz.setDescription(form.getDescription());
		return Quiz;
	}

	/**
	 * QuizFormへの変換
	 */
	public static QuizForm convertQuizForm(Quiz quiz) {
		QuizForm form = new QuizForm();
		form.setQuiz_id(quiz.getQuiz_id());
		form.setQuestion(quiz.getQuestion());
		form.setOption1(quiz.getOption1());
		form.setOption2(quiz.getOption2());
		form.setOption3(quiz.getOption3());
		form.setOption4(quiz.getOption4());
		form.setAnswer(quiz.getAnswer());
		form.setAuthor_name(quiz.getAuthor_name());
		form.setGenre(quiz.getGenre());
		form.setDescription(quiz.getDescription());
		// 更新画面設定
		form.setNewQuiz(false);
		return form;
	}
}
