package chapter3.question8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sample {

	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		Future<?> future = exec.submit(() -> {
			try {
				System.out.println("start");
				Thread.sleep(2000);
				System.out.println("end");
			}catch(InterruptedException e) {
				throw new RuntimeException(e);
			}
		});
		
		if(future.get() == null) {
			System.out.println("finish");
		}
	}

}
