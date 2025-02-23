package chapter3.section7.subsection4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMain {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("湊雄輔");
		names.add("朝香あゆみ");
		names.add("菅原拓真");
		names.add("大江岳人");
		
		System.out.println("ストリーム適用前");
		for(String name : names) {
			System.out.println(name);
		}
		
		//Predicateを定義（フルネームが４文字以下）
		Predicate<String> predicate = str -> str.length() <= 4; 
		//Functionを定義
		Function<String,String> function = str -> str + "さん";
		
		//フルネームが４文字以下であるすべての人物について、末尾に「さん」をつけて表示する
		System.out.println("ストリーム適用後");
		List<String> filterednames = names.stream()
			.filter(predicate)
			.map(function)
			.collect(Collectors.toList());
		for(String name : filterednames) {
			System.out.println(name);
		}
	}

}
