package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.BusinessLogic;

@SpringBootApplication
public class JavaConfigSampleApplication {
	
	/** 起動メソッド */
	public static void main(String[] args) {
		SpringApplication.run(JavaConfigSampleApplication.class, args)
				.getBean(JavaConfigSampleApplication.class).exe();
	}

	/** DI */
	@Autowired
	@Qualifier("test")
	private BusinessLogic business1; // TestLogicImplのインスタンス
	
	/** DI */
	@Autowired
	@Qualifier("sample")
	private BusinessLogic business2; // SampleLogicImplのインスタンス

	/** 実行メソッド */
	public void exe() {
		business1.doLigic();
		business2.doLigic();
	}
}
