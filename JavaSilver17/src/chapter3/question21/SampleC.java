package chapter3.question21;

public class SampleC {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			print(i);
		}
	}

	private static void print(int i) {
		switch (i) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("other");
		}
	}

}
