package problem4;

public class Problem4_2 {

	public static void main(String[] args) {
		//10面のサイコロをふる
		int dice = (int)(Math.random()*10)+1; 
		
		//表示回数をカウントする変数（0スタート）
		int count = 0; 
		
		System.out.println("数：" + dice);
		
		while(count < dice) {
			System.out.print("◼︎︎");
			count++;
		}

	}

}
