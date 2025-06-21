package chapter3.question21;

public class SampleA {

	public static void main(String[] args) {
		int a = 2;
		switch (a) {
		case 1 -> System.out.println("A");
		case 2 -> System.out.println("B");
		case 3 -> System.out.println("C");
		default -> System.out.println("D");
		}
	}
}
