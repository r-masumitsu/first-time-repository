package use;

import used.Calculator;
import used.SubCalc;

// ▽▽▽▽▽ リスト2.8 ▽▽▽▽▽
/**
* インターフェース依存を確認するためのクラス
*/
public class Call {
	public static void main(String[] args) {
		// 減算クラスをインスタンス化
		Calculator calculator = new SubCalc();  // ← 修正
		// メソッドを実行
		Integer result = calculator.calc(10, 5);
		// 結果の表示
		System.out.println("計算結果は「" + result + "」です。");
	}
}
// △△△△△ リスト2.8 △△△△△
