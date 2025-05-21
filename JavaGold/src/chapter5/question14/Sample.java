package chapter5.question14;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample {

	public static void main(String[] args) throws Exception{
		Path dir = Paths.get("dir", "subdir");
		
		//dir/subdirが存在しなければディレクトリを作成する
		if(Files.exists(dir) == false) {
			Files.createDirectories(dir);
		}
		
		//dirディレクトリにdata.txtを作成する
		Path a = Paths.get("data.txt");
		Files.createFile(dir.resolve(a));
	}

}
