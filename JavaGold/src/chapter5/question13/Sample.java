package chapter5.question13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws Exception{
		System.out.println("> ");
		
		//scanがリソースリークするためtryで囲んだ
		try (Scanner scan = new Scanner(System.in)) {
			String name = scan.nextLine();
			
			//dirディレクトリ配下のファイル（コンソールで指定）のパスを取得
			Path p = Paths.get("dir", name);
			
			//指定したパスのファイルがなければ、ファイルを新規に作る。あれば、例外を投げる
			if(Files.exists(p) == false){
				Files.createFile(p);
			}
			
			System.out.println(Files.getLastModifiedTime(p));
			System.out.println(Files.getPosixFilePermissions(p));
			
			System.out.println("delete y/n? >");
			if("y".equals(scan.nextLine())) {
				Files.delete(p);
				System.out.println("deleted");
			}
		}
		
		/*
		 * ファイルが存在すれば削除され、存在しなくても例外がスローされることはない。
		 */
		Path fake = Paths.get("fake.txt");
		try {
			Files.deleteIfExists(fake);
		}catch(IOException e) {
			// ファイルは存在したが、何らかの理由で削除できなかった
			throw new RuntimeException(e);
		}
	}

}
