package chapter5.question18;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Sample {
	public static void main(String[] args) throws Exception{
		
		Path dir = Paths.get("dir", "data");
		
		//dir/dataディレクトリが存在しない場合は作成する
		if(Files.exists(dir) == false) {
			Files.createDirectories(dir);
		}
		
		//dir/dataディレクトリ下にファイルを作成
		Files.createFile(dir.resolve(Paths.get("a.txt")));
		Files.createFile(dir.resolve(Paths.get("b.txt")));
		Files.createFile(dir.resolve(Paths.get("c.txt")));
		
		//dir/dataディレクトリ下のファイルの一覧を表示
		Files.list(dir).forEach(System.out::println);
		
		Files.walkFileTree(dir, new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException{
				return FileVisitResult.CONTINUE;
			}
		});
		
		//dir/dataディレクトリを削除
		Files.delete(dir);
		System.out.println("deleted");
	}
}
