package chapter4.section2;

//System.exit()によるプログラムの終了
public class SystemExitMain {

	public static void main(String[] args) {
		/*
		 * 何らかのデータを読み込む処理
		 */
		boolean isErr = true;
		if(isErr) {
			System.out.println("データが壊れています。異常終了します。");
			System.exit(1);	//ここでJVMを以上終了
		}
		System.out.println("正常終了しました。");
	}

}
