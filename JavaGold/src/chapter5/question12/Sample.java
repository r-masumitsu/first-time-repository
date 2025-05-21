package chapter5.question12;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample {

	public static void main(String[] args) {
		//Pathsクラスを使ってPathを取得
		Path path1 = Paths.get("dir/sample.txt");
		Path path2 = Paths.get("dir", "sample.txt");
		
		//FileクラスからPathを取得
		Path path3 = new File("dir/sample.txt").toPath(); 
		
		//絶対パスを取得して表示
		System.out.println(path1.toAbsolutePath());
		System.out.println(path2.toAbsolutePath());
		System.out.println(path3.toAbsolutePath());
	}

}
