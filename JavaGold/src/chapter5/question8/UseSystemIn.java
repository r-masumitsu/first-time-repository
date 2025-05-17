package chapter5.question8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UseSystemIn {

	public static void main(String[] args) throws Exception{
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.print("文字列を入力してください：");
			String input = br.readLine();
			System.out.print("文字列出力：");
			System.out.println(input);
		}
	}

}
