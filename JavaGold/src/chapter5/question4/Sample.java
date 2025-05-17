package chapter5.question4;

import java.io.BufferedReader;
import java.io.FileReader;

public class Sample {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("sample.txt");
		BufferedReader reader = new BufferedReader(fr);
		try(reader){
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
	}

}
