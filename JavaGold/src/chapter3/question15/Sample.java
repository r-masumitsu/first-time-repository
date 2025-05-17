package chapter3.question15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample {

	public static void main(String[] args) {
		//原子性を担保するように変更
		Value val = new AtomicValue();
		
		ExecutorService exec = Executors.newFixedThreadPool(2);
		
		/*
		 * 一つのValueインスタンスを二つのタスクで共有
		 */
		exec.submit(new Task(val));
		exec.submit(new Task(val));
		
		try {
			Thread.sleep(200);
		}catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		
		System.out.println(val.get());
		exec.shutdown();
	}

}
