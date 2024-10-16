package com.example.demo.example.impl;

import org.springframework.stereotype.Component;

import com.example.demo.example.Example;
import com.example.demo.service.SomeService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ConstructorInjectionOmitLombokExample implements Example {
	/** フィールド */
	private final SomeService someService;

	// コンストラクタが省略できる
	
	/** 実行 */
	public void run() {
		someService.doService();
	}
}