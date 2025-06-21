package chapter3.question23;

//値を戻すswitch式
public class Sample {

	public static void main(String[] args) {
		for(int i = 0; i < 4; i++) {
			print(i);
		}
	}
	
	private static void print(int i) {
		String result = switch (i) {
		case 1 -> "one";
		case 2 -> "two";
		case 3 -> "three";
		default -> "default".toUpperCase();
		};
		System.out.println(result);
	}

}
