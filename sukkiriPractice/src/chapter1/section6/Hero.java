package chapter1.section6;

public class Hero implements Cloneable {
	String name;	//名前
	int hp;	//HP
	Sword sword;	//装備している武器
	
	public Hero(String name, int hp,Sword sword) {
		this.name = name;
		this.hp = hp;
		this.sword = sword;
	}
	
	public Hero clone() {	//深いコピーにするためにthis.sword.clone()を使う
		Hero result = new Hero(this.name, this.hp,this.sword.clone());
		return result;
	}
	
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

	public Sword getSword() {
		return sword;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}

}
