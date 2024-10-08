package problem5;

public class problem5_B {

	public static void main(String[] args) {
		String[] week = {"日曜日","月曜日","火曜日","水曜日","木曜日","金曜日","土曜日"};
		
		//for文
		for(int i = 0; i < 7; i++) {
			System.out.println(week[i]);
		}
		
		//改行
		System.out.println();
		
		//拡張for文
		for(String day : week) {
			System.out.println(day);
		}
	}

}
