package chapter16;

import java.util.Scanner;

public class AtomicThreadMain {

	public static void main(String[] args) {
		System.out.println("止めるには「STOP」を入力してください");
		System.out.println("カウントダウンを開始します");
		AtomicPrintingThread thread1 = new AtomicPrintingThread();
		thread1.start();
		@SuppressWarnings("resource") //警告が出ないようにした
		String input = new Scanner(System.in).nextLine();
		if (input.equals("STOP")) {
			thread1.stopReq.set(true);
		}
		try {
			thread1.join();
		} catch (InterruptedException e) {
			System.out.println("InterruptedExceptionをキャッチしました");
			e.printStackTrace();
		}
	}

}
