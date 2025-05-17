package chapter4.question1;

import java.util.Optional;

/*
 * Optionalクラスの使用例
 * メソッドを使う側のメソッドで例外処理を書く必要が無くなった
 */
public class Test {

	public static void main(String[] args) {
		Optional<String> result = getFromArray(new String[] { "A", "B", null }, 3);
		if (result.isEmpty()) {
			System.out.println("empty");
			return;
		}
	}

	//配列とインデックス番号を受け取り、配列からインデックス番号に一致する要素を返すメソッド
	private static <T> Optional<T> getFromArray(T[] array, int index) {
		//引数arrayは参照型なので、nullを受け取る可能性がある
		if (array == null) {
			return Optional.empty();
		}

		//引数indexがarrayの要素数を超えてしまうことがある
		try {
			return Optional.ofNullable(array[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			return Optional.empty();
		}
	};

}
