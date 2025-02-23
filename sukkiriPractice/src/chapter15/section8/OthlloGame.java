package chapter15.section8;

public class OthlloGame {

	public static void main(String[] args) throws Exception {
		System.out.println("オセロゲームを開始します");

		//盤の状態を格納する配列
		int[][] board = new int[8][8];

		//インタフェースOthlloAl型の変数を用意
		OthelloAl ai = null;

		System.out.println(
				"コンピュータの強さを選んでください" +
						"（1=弱い,2=強い,3=その他）");

		int cpuno = new java.util.Scanner(System.in).nextInt();
		if (cpuno == 1) {
			ai = new WeakOthelloAI();
		} else if (cpuno == 2) {
			ai = new StrongOthelloAI();
		} else {
			System.out.println("人口知能クラスのFQCNを入力してください");
			String fqcn = new java.util.Scanner(System.in).nextLine();
			Class<?> clazz = Class.forName(fqcn);
			ai = (OthelloAl) clazz.newInstance();
		}

		while (true) {
			System.out.println("あなたの番：打つ場所を決めてください");
			/*
			 * 何かしらの処理
			 */
			System.out.println("わたしの番：打つ場所を決めます");
			int[] nextStone = ai.decide(board);
		}
	}

}
