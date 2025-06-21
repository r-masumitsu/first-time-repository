package chapter3.question22;

public class SampleB {

	public static void main(String[] args) {
		for(int i = 0; i < 4; i++) {
			print(i);
		}
	}
	
	private static void print(int i) {
		switch (i) {
		case 1 -> System.out.println("one");
		case 2 -> System.out.println("two");
		case 3 -> System.out.println("three");
		//defaultがないとコンパイルエラーになる
		default -> System.out.println("other");
		};
	}

}
