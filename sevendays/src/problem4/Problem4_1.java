package problem4;

public class Problem4_1 {
	
	public static void main (String srgs[]) {
		//10面のサイコロをふる
		int dice = (int)(Math.random()*10)+1; 
		
		System.out.println("数：" + dice);
		
		for(int i = 0; i < dice; i++) {
			System.out.print("◼︎︎");
		}
	}
}
