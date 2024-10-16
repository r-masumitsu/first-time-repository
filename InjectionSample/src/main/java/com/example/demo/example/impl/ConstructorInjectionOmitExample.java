package com.example.demo.example.impl;

import com.example.demo.example.Example;
import com.example.demo.service.SomeService;

//@Component
public class ConstructorInjectionOmitExample implements Example {
	/** フィールド */
	private final SomeService someService;

	/** コンストラクタインジェクション */
	public ConstructorInjectionOmitExample(SomeService someService) {
		this.someService = someService;
	}

	/** 実行 */
	public void run() {
		someService.doService();
	}
}