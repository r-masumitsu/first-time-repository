package chapter3.question24;

public class SampleB {

	public static void main(String[] args) {
		for(int i = 1; i < 4; i++) {
			print(i);
		}
	}
	
	private static void print(int i) {
		String result = switch(i) {
		case 1 : {
			System.out.println("case 1");
			yield "one";
		}
		//yeildがないので、フォールスルーが発生s
		case 2 : System.out.println("hello");
		case 3 : yield "three";
		default : throw new IllegalArgumentException("value:" + i);
		};
		
		System.out.println(result);
	}
}
