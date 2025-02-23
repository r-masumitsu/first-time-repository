package chapter7.section6.subsection3;

import java.io.Serializable;

//直列化に対応したHeroクラス
public class Hero implements Serializable{
	private String name;
	private int hp;
	private int mp;
	
	//（追加）コンストラクタ
	public Hero(String name, int hp, int mp) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	//（追加）ゲッターセッター
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
}
