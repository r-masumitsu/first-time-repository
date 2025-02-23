package chapter6.section5.subsection2;

import java.io.IOException;
import java.io.StringReader;

public class SrMain {	
    public static void main(String[] args) {
        // コンソールで確認するために例外時の処理を書いた
        
    	String msg = "第一土曜日は資源ゴミの回収です。";      
		try(StringReader fReader = new StringReader(msg)) {
	        System.out.println("全てのデータを読んで表示します");
	        int i = fReader.read();	//１文字読む
	        while(i != -1) {
	        	char c = (char)i;
	        	System.out.println(c);
	        	i = fReader.read();	//これ以上読めるデータがない時は-1を返す
	        }
	        System.out.println("ファイルの末尾に到達しました");
			System.out.println("ファイルを読み込みました: ");
		} catch (IOException e) {
			System.out.println("例外が発生しました: " + e.getMessage());
		}
    }

}
