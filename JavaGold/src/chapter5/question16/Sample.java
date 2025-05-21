package chapter5.question16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws Exception{
		//ファイルがなければ作成する
		Path sample = Paths.get("dir", "sample.txt");
		if(Files.exists(sample) == false) {
			Files.createFile(sample);
		}
		
		Scanner scan = new Scanner(System.in);
		BufferedWriter out = Files.newBufferedWriter(sample, StandardOpenOption.APPEND);
		
		//ファイルに書き込み
		try(scan; out){
			System.out.print("> ");
			out.write(scan.nextLine());
			out.newLine();
		}
		
		BufferedReader in = Files.newBufferedReader(sample);
		try(in) {
			in.lines().forEach(System.out::println);
		}
	}

}
