package com.example.demo.used;

/**
* 朝の挨拶を行う
*/
//@Component
public class MorningGreet implements Greet {
	@Override
	public String greeting() {
		return "おはようございます";
	}
}