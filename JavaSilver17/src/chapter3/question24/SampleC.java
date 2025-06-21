package chapter3.question24;

public class SampleC {

	public static void main(String[] args) {
		for(int i = 1; i < 4; i++) {
			print(i);
		}
	}
	
	private static void print(int i) {
		String result = switch(i) {
		case 1 -> {
			System.out.println("case 1");
			yield "one";
		}
		//yeildで、値を返さないとコンパイルエラーになる（不本意なフォールスルーを防止できる）
		//case 2 -> System.out.println(hello);
		case 3 -> "three";
		default -> throw new IllegalArgumentException("value:" + i);
		};
		
		System.out.println(result);
	}
}
