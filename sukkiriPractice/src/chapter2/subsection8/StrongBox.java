package chapter2.subsection8;

public class StrongBox<E> {
	//フィールド
	private E data;
	private Keytype keytype;
	//施行回数を保持するフィールド
	private int count;
	//必要施行回数
	private final int PADLOCKCOUNT = 1024;
	private final int BUTTONCOUNT = 10000;
	private final int DIALCOUNT = 10000;
	private final int FINGERCOUNT = 1000000;
	
	//ゲッター
	public int getPADLOCKCOUNT() {
		return PADLOCKCOUNT;
	}
	public int getBUTTONCOUNT() {
		return BUTTONCOUNT;
	}
	public int getDIALCOUNT() {
		return DIALCOUNT;
	}
	public int getFINGERCOUNT() {
		return FINGERCOUNT;
	}
	
	//コンストラクタ
	public StrongBox(Keytype keytype) {
		this.keytype = keytype;
	}
	
	//メソッド
	public void put(E d) {
		this.data = d;
	}
	
	public E get() {
		switch (keytype) {
			case PADLOCK:
				if(count < PADLOCKCOUNT) {
					count++;
					return null;
				}else {
					return data;
				}
			case BUTTON:
				if(count < BUTTONCOUNT) {
					count++;
					return null;
				}else {
					return data;
				}
			case DIAL:
				if(count < DIALCOUNT) {
					count++;
					return null;
				}else {
					return data;
				}
			case FINGER:
				if(count < FINGERCOUNT) {
					count++;
					return null;
				}else {
					return data;
				}
			default:
				throw new IllegalArgumentException("Unexpected value: " + keytype);
		}
	}
}
