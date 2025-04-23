package com.example.yontaku.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.yontaku.entity.Quiz;
import com.example.yontaku.form.QuizForm;
import com.example.yontaku.helper.QuizHelper;
import com.example.yontaku.service.QuizService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class QuizController {

	/** DI */
	private final QuizService quizService;

	@GetMapping
	public String list(Model model) {
		model.addAttribute("quizs", quizService.findAllQuiz());
		return "top";
	}

	@GetMapping("/home")
	public String home(Model model,
			@ModelAttribute QuizForm form,
			@AuthenticationPrincipal UserDetails userDetails) {
		form.setNewQuiz(true);
		model.addAttribute("quizs", quizService.findByNameQuiz(userDetails.getUsername()));
		return "quiz/home";
	}

	@GetMapping("/{id}")
	public String detail(@PathVariable Integer id, Model model,
			RedirectAttributes attributes) {
		Quiz quiz = quizService.findByIdQuiz(id);
		if (quiz != null) {
			// 対象データがある場合はモデルに格納
			model.addAttribute("quiz", quizService.findByIdQuiz(id));
			return "quiz/detail";
		} else {
			// 対象データがない場合はフラッシュメッセージを設定
			attributes.addFlashAttribute("errorMessage", "対象データがありません");
			// リダイレクト
			return "redirect:/home";
		}
	}

	/**
	 * 新規登録を実行します。
	 */
	@PostMapping("/insert")
	public String create(@Validated QuizForm form,
			BindingResult bindingResult,
			RedirectAttributes attributes) {
		// === バリデーションチェック ===
		// 入力チェックNG：入力画面を表示する
		if (bindingResult.hasErrors()) {
			// 新規登録画面の設定
			form.setNewQuiz(true);
			return "quiz/form";
		}
		// エンティティへの変換
		Quiz quiz = QuizHelper.convertQuiz(form);
		// 登録実行
		quizService.insertQuiz(quiz);
		// フラッシュメッセージ
		attributes.addFlashAttribute("message", "新しいquizが作成されました");
		// PRGパターン
		return "redirect:/home";
	}

	/**
	 * 指定されたIDの修正画面を表示します。
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Integer id, Model model,
			RedirectAttributes attributes) {
		// IDに対応する「すること」を取得
		Quiz target = quizService.findByIdQuiz(id);
		if (target != null) {
			// 対象データがある場合はFormへの変換
			QuizForm form = QuizHelper.convertQuizForm(target);
			// モデルに格納
			model.addAttribute("quizForm", form);
			return "quiz/home";
		} else {
			// 対象データがない場合はフラッシュメッセージを設定
			attributes.addFlashAttribute("errorMessage", "対象データがありません");
			// 一覧画面へリダイレクト
			return "redirect:/home";
		}
	}

	@PostMapping("/update")
	public String update(@Validated QuizForm form,
			BindingResult bindingResult,
			RedirectAttributes attributes) {
		// === バリデーションチェック ===
		// 入力チェックNG：入力画面を表示する
		if (bindingResult.hasErrors()) {
			// 更新画面の設定
			form.setNewQuiz(null);
			return "quiz/form";
		}
		// エンティティへの変換
		Quiz quiz = QuizHelper.convertQuiz(form);
		// 更新処理
		quizService.updateQuiz(quiz);
		// フラッシュメッセージ
		attributes.addFlashAttribute("message", "quizが更新されました");
		// PRGパターン
		return "redirect:/quizs";
	}

	@PostMapping("/delete/{id}")
	public String delete(@PathVariable Integer id, RedirectAttributes attributes) {
		// 削除処理
		quizService.deleteQuiz(id);
		// フラッシュメッセージ
		attributes.addFlashAttribute("message", "quizが削除されました");
		// PRGパターン
		return "redirect:/quizs";
	}
}