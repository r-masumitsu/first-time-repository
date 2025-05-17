package chapter3.question3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class nCTP {

	public static void main(String[] args) throws Exception{
		ExecutorService exec = Executors.newCachedThreadPool();
		Runnable test = () -> {
			System.out.println(Thread.currentThread().getName());
		};
		
		for(int i = 0; i < 5; i++) {
			exec.submit(test);
		}
		
		Thread.sleep(1 * 10000);
		System.out.println("----------10秒後----------");
		
		
		for(int i = 0; i < 5; i++) {
			exec.submit(test);
		}
		
		Thread.sleep(1 * 70000);
		System.out.println("----------70秒後----------");
		
		for(int i = 0; i < 5; i++) {
			exec.submit(test);
		}
	}

}
