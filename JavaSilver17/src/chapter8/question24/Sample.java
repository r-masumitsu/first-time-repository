package chapter8.question24;

public class Sample {

	public static void main(String[] args) {
		System.out.println(test("A"));
	}
	public static String test(Object obj) {
		String s = "";
		if(!(obj instanceof String str)) {
			s = obj.toString();
		}else {
			s = str.toLowerCase();
		}
		return s;
	}

}
