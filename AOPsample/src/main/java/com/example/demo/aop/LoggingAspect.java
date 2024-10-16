package com.example.demo.aop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	// @Before("execution(* com.example.demo.service.TargetService.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		LocalDateTime startTime = LocalDateTime.now(); // 現在の日時を取得
		String formattedTime = startTime.format(DateTimeFormatter.ofPattern("HH:mm:ss:SSS"));
		System.out.println("------- 【@Before】-------");
		System.out.println("Before method：" + joinPoint.getSignature());
		System.out.println("メソッド開始: " + formattedTime);
	}

	// @After("execution(* com.example.demo.service.TargetService.*(..))")
	public void afterAdvice(JoinPoint joinPoint) {
		LocalDateTime endTime = LocalDateTime.now(); // 現在の日時を取得
		String formattedTime = endTime.format(DateTimeFormatter.ofPattern("HH:mm:ss:SSS"));
		System.out.println("------- 【@After 】-------");
		System.out.println("After method：" + joinPoint.getSignature());
		System.out.println("メソッド終了: " + formattedTime);
	}

	@Around("execution(* com.example.demo.service.TargetService.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		System.out.println("===== 【@Around：前】=====");
		System.out.println("■Target");
		System.out.println(" クラス ：" + joinPoint.getSignature().getDeclaringTypeName());
		System.out.println(" メソッド：" + joinPoint.getSignature().getName());
		
		Object result = joinPoint.proceed(); // 実行メソッドを呼び出す
		
		System.out.println("===== 【@Around：後】=====");
		long elapsedTime = System.currentTimeMillis() - startTime;
		System.out.println("Method execution time: " + elapsedTime + "milliseconds.");
		return result;
	}
}