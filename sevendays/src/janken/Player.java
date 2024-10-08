package janken;

public class Player {
	//プレイヤーの名前
	String name;

	//名前をセットするコンストラクタ
	public Player(String name) {
		this.name = name;
	}

	//グーチョキパーを出すメソッド
	public String pon() {
		//アイテムを生成するための乱数
		int ramdomNumber = (int) (Math.random() * 3) + 1;
		String item = null;
		switch (ramdomNumber) {
		case 1: {
			item = "グー";
			break;
		}
		case 2: {
			item = "チョキ";
			break;
		}
		case 3: {
			item = "パー";
			break;
		}
		default:
			item = "グチパ";
			break;
		}
		return item;
	}
}