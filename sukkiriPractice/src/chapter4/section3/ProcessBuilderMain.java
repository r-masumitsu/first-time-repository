package chapter4.section3;

public class ProcessBuilderMain {

    public static void main(String[] args) throws Exception {
        System.out.println("計算を開始します");
        /*
         * 何らかの計算処理
         */
        System.out.println("計算完了。結果をメモ帳で表示します。");

        // macOSで外部プログラム（TextEdit）を実行するコード
        ProcessBuilder pb = new ProcessBuilder(
            "open", "-a", "TextEdit",
            "/Users/r.masumitsu/Documents/「UMInoSACHI」簡易設計書.rtf"
        );
        pb.start();	//起動
    }
}
