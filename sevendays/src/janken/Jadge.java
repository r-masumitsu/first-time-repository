package janken;

public class Jadge {
	//あいこのフラグ
	boolean drawFlg = false;
	
	//スリープするメソッドを定義
	public static void sleep() {
        try {
            // 1.5秒間一時停止する
            Thread.sleep(1500);
        } catch(InterruptedException e){
            e.printStackTrace();
        }  
	}
	
	public void jadgeCall(String speech) {
		System.out.println("審判「" + speech + "」");
	}
	
	public void callStart() {
		jadgeCall("じゃんけん開始");
	}
	public void callEnd() {
		jadgeCall("じゃんけん終了");
	}
	
	public void determine(Player player1, Player player2) {
		//決着がつくまでループ
		LabelA:while(true){
			sleep();
			if(drawFlg) {
				System.out.println(player1.name + "・" + player2.name + "「あいこで！」");
			}else {
				System.out.println(player1.name + "・" + player2.name + "「じゃん！けん！」");
			}
			String item1 = player1.pon();
			String item2 = player2.pon();
			sleep();
			System.out.println(player1.name + "「" + item1 + "！」");
			System.out.println(player2.name + "「" + item2 + "！」");
			sleep();
			
			//勝敗判定
			switch (item1) {
				case "グー":
					if(item2 == "チョキ") {
						jadgeCall(player1.name + "の勝ち！");
						break LabelA;
					}else if(item2 == "パー"){
						jadgeCall(player2.name + "の勝ち！");
						break LabelA;
					}else {
						jadgeCall("引き分け！もう１回！");
						drawFlg = true;
						break;
					}
				case "チョキ":
					if(item2 == "パー") {
						jadgeCall(player1.name + "の勝ち！");
						break LabelA;
					}else if(item2 == "グー"){
						jadgeCall(player2.name + "の勝ち！");
						break LabelA;
					}else {
						jadgeCall("引き分け！もう１回！");
						drawFlg = true;
						break;
					}
				case "パー":
					if(item2 == "グー") {
						jadgeCall(player1.name + "の勝ち！");
						break LabelA;
					}else if(item2 == "チョキ"){
						jadgeCall(player2.name + "の勝ち！");
						break LabelA;
					}else {
						jadgeCall("引き分け！もう１回！");
						drawFlg = true;
						break;
					}
				default:
					jadgeCall("反則！試合中止！");
					break LabelA;
			}
		}
		sleep();
	}
}
