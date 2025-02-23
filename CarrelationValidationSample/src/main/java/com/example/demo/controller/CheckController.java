package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.SampleForm;

@Controller
public class CheckController {
	// 入力画面の表示
	@GetMapping()
	public String showForm(SampleForm form) {
		return "entry";
	}

	// 相関項目チェックの実行
	@PostMapping
	public String check(@Validated SampleForm form,
			BindingResult bindingResult, Model model) {
		// バリデーションの実施
		if (bindingResult.hasErrors()) {
			return "entry";
		}
		model.addAttribute("message", "入力に問題ありません");
		return "result";
	}
}