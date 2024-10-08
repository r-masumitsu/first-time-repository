package problemex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Problemex6 {

	public static void main(String[] args) throws IOException{
		HashMap<String, String> map = new HashMap<>();
		map.put("cat", "猫");
		map.put("dog", "犬");
		map.put("bird", "鳥");
		map.put("tiger", "トラ");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("英語で動物の名前を入力してください：");
		//  コンソールから文字列の読み込み
		String buf = br.readLine();

		String animalName = map.get(buf);

		if (animalName == null) {
			System.out.println("対応するデータは登録されていません。");
		} else {
			System.out.println("「" + animalName + "」です");
		}
	}

}
