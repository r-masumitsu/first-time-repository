package chapter3.question11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//別スレッドで発生した例外を受け取り、例外処理をする
public class Sample {

	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newSingleThreadExecutor();

		List<Future<Boolean>> futures = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			futures.add(exec.submit(() -> {
				if (new Random().nextInt() % 2 != 0) {
					throw new Exception("Odd Number");
				}
				return true;
			}));
		}

		int total = 0;

		for (Future<Boolean> future : futures) {
			Boolean result = false;
			try {
				result = future.get();
				System.out.println(result);
			}catch(ExecutionException e) {
				System.out.println(e.getMessage());
			}
			if (result) {
				total++;
			}
		}
		System.out.println(total);
	}

}
