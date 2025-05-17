package chapter5.question4;

import java.io.BufferedReader;
import java.io.FileReader;

public class NewSample {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("sample.txt");
		BufferedReader reader = new BufferedReader(fr);
		try(reader){
			//StreamAPIを使う
			reader.lines().forEach(System.out::println);
		}
	}
}
