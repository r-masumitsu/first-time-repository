package chapter3.question3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Executorクラスの使用例（newSingleThreadExecutorメソッド）
public class nSTE {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		for(int i = 0; i < 5; i++) {
			//⭐︎submitメソッドはExecutorServiceのスレッドにタスクを与えて実行する
			exec.submit(() -> {
				System.out.println(Thread.currentThread().getName());	//注意が表示されたのでgetId()を書き換えた
			});
		}
	}

}
