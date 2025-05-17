package chapter4.question21;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
 * 推奨されないコード
 * 副作用のある処理は記述すべきではない
 */
public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Consumer<String> c = str -> {
			list.add(str);	//ここで外部オブジェクトも変更
		};
		LazyExecute.execute(c);	//ここで何が行われるかわからない
		System.out.println(list.size());
	}

}
