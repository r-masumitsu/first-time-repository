package com.example.demo.example.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.example.Example;
import com.example.demo.service.SomeService;

//@Component
public class ConstructorInjectionExample implements Example {
	/** フィールド */
	private final SomeService someService;

	/** コンストラクタインジェクション */
	@Autowired
	public ConstructorInjectionExample(SomeService someService) {
		this.someService = someService;
	}

	/** 実行 */
	public void run() {
		someService.doService();
	}
}