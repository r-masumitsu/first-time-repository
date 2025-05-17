package chapter4.question1;

public class OldTest {

	public static void main(String[] args) {
		try {
			String result = getFromArray(new String[] {"A","B",null}, 3);
			if(result == null) {
				System.out.println("empty");
				return;
			}
		}catch (IllegalArgumentException e) {
			System.out.println("exception");
		}
	}
	
	//配列とインデックス番号を受け取り、配列からインデックス番号に一致する要素を返すメソッド
	private static <T> T getFromArray(T[] array, int index){
		//引数arrayは参照型なので、nullを受け取る可能性がある
		if(array == null) {
			throw new IllegalArgumentException();
		}
		
		//引数indexがarrayの要素数を超えてしまうことがある
		try {
			return array[index];
		}catch (ArrayIndexOutOfBoundsException e) {
			throw new IllegalArgumentException();
		}
	};
}
