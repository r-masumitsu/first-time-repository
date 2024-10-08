package janken;

import java.util.Scanner;

public class Match {
	public static void main(String[] args) {
		System.out.println("じゃんけんをさせましょう。プレイヤー名を入れてください。");
		
		//文字列（プレイヤー名）の受け取り
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("１人目のプレイヤー名：");
	    String name1 = scanner.next();
	    System.out.print("２人目のプレイヤー名：");
	    String name2 = scanner.next();
		scanner.close();
	    
		//審判のインスタンス化
		Jadge jadge = new Jadge();
	    
	    //プレイヤーのインスタンス化
	    Player player1 = new Player(name1);
	    Player player2 = new Player(name2);
	    
	    //審判に試合を進めてもらう
	    jadge.callStart();
	    jadge.determine(player1, player2);
	    jadge.callEnd();
	}
}
