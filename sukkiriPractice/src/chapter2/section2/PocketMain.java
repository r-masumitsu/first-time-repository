package chapter2.section2;

public class PocketMain {

	public static void main(String[] args) {
		Pocket<String> pocket = new Pocket<>();
		pocket.put("1192");	//キャストは不要
		String str = pocket.get();
		System.out.println(str);
	}

}
