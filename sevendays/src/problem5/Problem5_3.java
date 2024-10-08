package problem5;

public class Problem5_3 {
	public static void main(String[] args) {
		
		//配列の大きさを示す変数を宣言及び初期化
		int max = 10;
		//配列変数の宣言及び初期化
		int data[] = new int[max];
		
		//「配列要素に乱数を格納し、表示させる」の繰り返し
		for(int i = 0; i < max; i++) {
			int ramdomNumber =  (int)(Math.random()*100)+1;
			data[i] = ramdomNumber;
			System.out.print(data[i] + " ");
		}
		
		//改行
		System.out.println();
		
		//奇数を表示
		System.out.print("奇数：");
		for(int i : data) {
			if(i % 2 !=	0) {
				System.out.print(i + " ");
			}
		}
		
		//改行
		System.out.println();
		
		//偶数を表示
		System.out.print("偶数：");
		for(int i : data) {
			if(i % 2 ==	0) {
				System.out.print(i + " ");
			}
		}
	}
}