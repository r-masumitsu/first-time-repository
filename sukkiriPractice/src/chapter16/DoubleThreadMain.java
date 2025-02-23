package chapter16;

import java.util.Scanner;

//カウントダウン中も入力を受け付ける
public class DoubleThreadMain {

	public static void main(String[] args) {
		System.out.println("止めるには「STOP」を入力してください");
		System.out.println("カウントダウンを開始します");
		Thread thread1 = new PrintingThread();
		thread1.start();
		@SuppressWarnings("resource") //警告が出ないようにした
		String input = new Scanner(System.in).nextLine();
		System.out.println("入力文字列：" + input);
		System.out.println("停止処理は未作成です");
	}

}
