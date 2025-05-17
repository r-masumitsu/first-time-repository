package chapter3.question12;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

//CyclicBarrirクラスの使用例
public class Task implements Runnable{
	//CyclicBarrierへの参照を持たせる
	private CyclicBarrier barrier;
	
	public Task(CyclicBarrier barrier) {
		super();
		this.barrier = barrier;
	}

	@Override
	public void run() {
		String id = Thread.currentThread().getName();
		System.out.println("START:" + id);
		
		int r = new Random().nextInt(10);
		try {
			Thread.sleep(r * 100);
		}catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		
		System.out.println("END:" + id);
		try {
			//処理が終了したことをバリアーに通知する
			this.barrier.await();
		}catch (InterruptedException | BrokenBarrierException e) {
			throw new RuntimeException(e);
		}
	}
}
