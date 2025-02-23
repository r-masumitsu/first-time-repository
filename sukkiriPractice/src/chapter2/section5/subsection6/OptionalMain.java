package chapter2.section5.subsection6;

import java.util.Optional;

public class OptionalMain {
	//文字列sを文字cで挟んで装飾するメソッド
	//・文字列sがnullまたは長さ0の場合は、nullを返す。
	//・戻り値は「nullの可能性がある」ことを明示するために、単なるStringではなくOptional<String>とする。
	//戻り値の型をOptional<String>とすることにより、戻り値に「nullの可能性がある」ことが呼び出す側に認識される。
	public static Optional<String> decorate(String s, char c){
		String r;
		if(s == null || s.length() == 0) {
			r = null; 
		}else {
			r = c + s + c;
		}
		return Optional.ofNullable(r);
	}
	
	public static void main(String[] args) {
		//orElse()でnullを置換して内容を確認できる（必然的にnullを考慮した処理を書くことになる）
		Optional<String> optionnal1 =  decorate("クリスマスツリー", '*');
		System.out.println(optionnal1.orElse("nullのため処理できません"));
		Optional<String> optionnal2 =  decorate(null, '*');
		System.out.println(optionnal2.orElse("nullのため処理できません"));
	}
}
