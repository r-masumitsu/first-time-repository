package chapter4.question31;

public class Sample {

	public static void main(String[] args) {
		Customer a = new Customer("A", 20, "Tokyo");
		System.out.println("顧客名：" + a.name());
		System.out.println("文字列表現：" + a.toString());
		System.out.println("ハッシュコード：" + a.hashCode());
		
		Customer b = new Customer("B", 20, "Osaka");
		System.out.println("イコールズメソッド：" + args.equals(b));
	}

}
