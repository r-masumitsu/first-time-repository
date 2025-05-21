package chapter5.question15;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample {

	public static void main(String[] args) throws Exception{
		
		//dirディレクトリにsample.txtがなければ作成する
		Path sample = Paths.get("dir", "sample.txt");
		if(Files.exists(sample) == false) {
			Files.createFile(sample);
		}
		
		//コピー
		Path outFile = Paths.get("dir", "sample_bk.txt");
		Files.copy(sample, outFile);
		
		//移動
		Path dir = Paths.get("dir", "subdir");
		Path dest = dir.resolve(Paths.get("sample.txt"));
		Files.move(sample, dest);
		}

}
