package problem4;

public class problem4_3 {

	public static void main(String[] args) {
		//10面のサイコロをふる
		int dice = (int)(Math.random()*10)+1; 
		
		//表示回数をカウントする変数（0スタート）
		int count = 0; 
		
		System.out.println("数：" + dice);
		
		do {
			System.out.print("◼︎︎");
			count++;
		} while (count < dice);
	}

}
