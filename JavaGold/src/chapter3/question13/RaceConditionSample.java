package chapter3.question13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//競合しないプログラム
public class RaceConditionSample implements Runnable{
	private int num = 100;
	
	public static void main(String[] args) {
		RaceConditionSample s = new RaceConditionSample();
		ExecutorService exec = Executors.newFixedThreadPool(2);
		exec.submit(s);
		exec.submit(s);
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		
		System.out.println(s.num);
		exec.shutdown();
	}
	
	//synchronizedメソッド（競合しない）
	public synchronized void add(int amount) {
		this.num = this.num + amount;
	}
	
	@Override
	public void run() {
		add(100);
	}

}
