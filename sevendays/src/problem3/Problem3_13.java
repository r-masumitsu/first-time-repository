package problem3;

public class Problem3_13 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*3)+1;    //  1から6までの乱数を発生させる
		
		switch(num) {
			case 1:
				System.out.println("グー");
				break;
			case 2:
				System.out.println("チョキ");
				break;
			case 3:
				System.out.println("パー");
				break;
		}
	}

}
