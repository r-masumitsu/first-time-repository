package chapter3.question9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sample {

	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		Future<String> future = exec.submit(() -> {
			try {
				System.out.println("start");
				Thread.sleep(2000);
				System.out.println("end");
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}, "finish");
		String result = future.get();
		System.out.println(result);
	}
}
