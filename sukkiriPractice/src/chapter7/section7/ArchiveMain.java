package chapter7.section7;

import java.util.Collections;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

//ZIPファイルの内容一覧を表示するプログラム
public class ArchiveMain {

	public static void main(String[] args) {
		//JARファイルも実体はZIPファイルなので開くことができる
		try(ZipFile file = new ZipFile("/Applications/Eclipse_2023-12.app/Contents/workspace/sukkiriPractice/commons-io-2.18.0.jar")) {
			System.out.println("指定されたアーカイブファイルの内容一覧を表示します");
			for(ZipEntry e : Collections.list(file.entries())) {
				System.out.println(e.getName() + " サイズ=" + e.getCompressedSize());
			}
		} catch (Exception e) {
			System.out.println("例外が発生しました");
			e.printStackTrace();
		}
	}

}
