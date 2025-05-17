package chapter3.question16;

import java.util.List;

//リストの要素の読み込みを行うクラス
public class ReadTask implements Runnable {
	private List<Integer> list;

	public ReadTask(List<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		try {
			for(Integer i : list) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
				System.out.println(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
