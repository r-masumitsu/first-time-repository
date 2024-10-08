package problemex3;

public class SmartPhone extends Computer {
    //  コンストラクタ
    public SmartPhone(){
        super("スマートフォン");
    }
	@Override	//  入力処理
	public void input() {
        System.out.println("タッチパネルディスプレイをタップして操作");

	}

	@Override	//  出力処理
	public void output() {
        System.out.println("タッチパネルディスプレイに出力");

	}
	
	@Override
    public void communication(){
        System.out.println("インターネットと電話回線で通信");
    }
}
