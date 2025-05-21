package chapter5.question17;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample2 {

	public static void main(String[] args) throws Exception{
		Path base = Paths.get(".");
		DirectoryStream<Path> dirs = Files.newDirectoryStream(base);
		for(Path p : dirs) {
			System.out.println(p.getFileName());
		}
	}

}
