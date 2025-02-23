package chapter1.section4;

import java.util.Objects;

public class Hero {
	public String name;
	int hp;
	
	public boolean equals(Object object) {
		if(object == this) {	//自身が引数として渡されたなら、無条件でtrueを返す。
			return true;
		}
		if(object == null) {	//nullが引数として渡されたなら、無条件でfalseを返す。
			return false;
		}
		if(!(object instanceof Hero)) {	//型が異なるならば、falseを返す。
			return false;
		}
		Hero hero = (Hero)object;	//型が同じなら比較できるように適切にキャストする。
		if(!this.name.trim().equals(hero.name.trim())) {	//同じ文字列でないならば、falseを返す。
			return false;
		}
		return true;	//等価
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.hp);
	}
}
