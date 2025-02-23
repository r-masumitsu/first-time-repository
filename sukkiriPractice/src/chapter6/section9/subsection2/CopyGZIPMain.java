package chapter6.section9.subsection2;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

//FileInputStreamクラスとFileOutputStreamクラスを使ってファイルをコピーするプログラム
//ファイルを書き込む際、java.util.zip.GZIPOutputStreamを使って圧縮する。
//ファイルの書き込みには必ずバッファリングを行う。
//例外処理を正しく行う。
public class CopyGZIPMain {
	public static void main(String[] args) {
		//起動パラメータからパスを取得
		String sourcePath = args[0];
		String targetPath = args[1];
		try (FileInputStream fis = new FileInputStream(sourcePath);
				FileOutputStream fos = new FileOutputStream(targetPath);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				GZIPOutputStream gzos = new GZIPOutputStream(bos);) {
			int i = fis.read(); //１バイト読む
			while (i != -1) {
				gzos.write(i); //１バイト書く
				i = fis.read(); //これ以上読めるデータがない時は-1を返す
			}
			gzos.flush(); // 書き込みを反映
			System.out.println("ファイルの読み込みと書き込みが終わりました");
		} catch (IOException e) {
			System.out.println("入出力例外が発生しました。");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("例外が発生しました。");
			e.printStackTrace();
		}
	}

}
