package chapter6.section2.subsection2;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {
    public static void main(String[] args) {
        // コンソールで確認するために例外時の処理を書いた
        
        // ファイルパスをここで定義（MacOS環境用）
    	//⭐︎Javaのコードでファイルパスを指定するときは、正しいパスの記述と文字エスケープに注意。
    	//⭐︎特にMac環境では、ファイルパスの区切りとして/を使用する
    	//⭐︎Java文字列内でWindowsの¥を使用する場合はエスケープが必要だが、Macでは不要。
    	// ファイルパスをここで定義（MacOS環境用）
        String filePath = "/Applications/Eclipse_2023-12.app/Contents/workspace/sukkiriPractice/resources/rpsave.dat";
        
        // finally句でclose()メソッドを使用するために変数を用意
        FileReader fReader = null;        
		try {
			fReader = new FileReader(filePath);
	        System.out.println("全てのデータを読んで表示します");
	        int i = fReader.read();	//１文字読む
	        while(i != -1) {
	        	char c = (char)i;
	        	System.out.println(c);
	        	i = fReader.read();	//これ以上読めるデータがない時は-1を返す
	        }
	        System.out.println("ファイルの末尾に到達しました");
			System.out.println("ファイルを読み込みました: " + filePath);
		} catch (IOException e) {
			System.out.println("例外が発生しました: " + e.getMessage());
		} finally {
			if (fReader != null) {
				try {
					fReader.close();
					System.out.println("ファイルを正常に閉じました。");
				} catch (IOException e) {
					System.out.println("例外が発生しました。ファイルが正常に閉じられませんでした。");
					e.printStackTrace();
				}
			}
		} 
    }
}
