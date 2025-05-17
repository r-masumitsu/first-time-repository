package chapter3.question10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sample {

	public static void main(String[] args) throws Exception{
		ExecutorService exec = Executors.newSingleThreadExecutor();
		
		//スレッドのタスクを作成
//		Callable<Boolean> task = new Callable<Boolean>() {
//			@Override
//			public Boolean call() throws Exception{
//				return new Random().nextInt() % 2 == 0;
//			}
//		};
		
		
//		List<Future<Boolean>> futures = new ArrayList<>();
//		for(int i = 0; i < 10; i++) {
//			futures.add(exec.submit(task));
//		}
		
		//ラムダ式に書き換えたコード
		List<Future<Boolean>> futures = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			futures.add(exec.submit(() -> {
				return new Random().nextInt() % 2 == 0;
			}));
		}
		
		int total = 0;
		
		for(Future<Boolean> future : futures) {
			Boolean result = future.get();
			System.out.println(result);
			if(result) {
				total++;
			}
		}
		System.out.println(total);
	}

}
