package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamController {
	
	// GET かつ [url：/show]
	@GetMapping("show")
	public String showView() {
		// 表示する「ビュー名」
		return "input";
	}

	// GET かつ [url：/result]
	@GetMapping("result")
	public String showResultGet(
			@RequestParam String val, Model model) {
		// モデルに送られてきた値を設定
		model.addAttribute("value", val);
		// 表示する「ビュー名」
		return "output";
	}

	// POST かつ [url：/result]
	@PostMapping("result")
	public String showResultPost(
			@RequestParam String val, Model model) {
		// モデルに送られてきた値を設定
		model.addAttribute("value", val);
		// 表示する「ビュー名」
		return "output";
	}

}