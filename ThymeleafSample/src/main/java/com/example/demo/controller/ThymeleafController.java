package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {
	// ▽▽▽▽▽ リスト6.28 ▽▽▽▽▽
	@GetMapping("show")
	public String showView(Model model) {
		// 「Model」にデータを格納する
		model.addAttribute("name", "太郎");
		// 戻り値は「ビュー名」を返す
		return "main";
	}
	// △△△△△ リスト6.28 △△△△△
}