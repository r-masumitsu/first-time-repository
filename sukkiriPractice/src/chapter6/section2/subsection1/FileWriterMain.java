package chapter6.section2.subsection1;

import java.io.FileWriter;
import java.io.IOException;

// FileWriterを用いたテキストファイルの書き込み
public class FileWriterMain {
    public static void main(String[] args) {
        // コンソールで確認するために例外時の処理を書いた
        
        // ファイルパスをここで定義（MacOS環境用）
    	//⭐︎Javaのコードでファイルパスを指定するときは、正しいパスの記述と文字エスケープに注意。
    	//⭐︎特にMac環境では、ファイルパスの区切りとして/を使用する
    	//⭐︎Java文字列内でWindowsの¥を使用する場合はエスケープが必要だが、Macでは不要。
    	// ファイルパスをここで定義（MacOS環境用）
        String filePath = "/Applications/Eclipse_2023-12.app/Contents/workspace/sukkiriPractice/resources/rpgsave.dat";
        
        // finally句でclose()メソッドを使用するために変数を用意
        FileWriter fWriter = null;
        try {
        	//第２引数がtrueの場合、もしすでにファイルが存在していた場合その末尾からデータを追記していく
        	//第２引数がfalseまたは省略の場合、必ずファイルの先頭からデータを上書きしていく
            fWriter = new FileWriter(filePath, false);
            // ファイルに文字 'A' を書き込む
            fWriter.write('A');
            // 書き込みを即座に反映
            fWriter.flush();
            System.out.println("ファイルに書き込みました: " + filePath);
        } catch (IOException e) {
            System.out.println("例外が発生しました: " + e.getMessage());
        } finally {
            if (fWriter != null) {
                try {
                    fWriter.close();
                    System.out.println("ファイルを正常に閉じました。");
                } catch (IOException e) {
                    System.out.println("例外が発生しました。ファイルが正常に閉じられませんでした。");
                    e.printStackTrace();
                }
            }
        }
    }
}