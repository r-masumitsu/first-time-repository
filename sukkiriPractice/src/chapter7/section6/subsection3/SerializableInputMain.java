package chapter7.section6.subsection3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//勇者インスタンスを復元し表示するプログラム
public class SerializableInputMain {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("/Applications/Eclipse_2023-12.app/Contents/workspace/sukkiriPractice/resources/rpgsave.dat")) {
			ObjectInputStream ois = new ObjectInputStream(fis);
			//ファイルからインスタンスを復元
			Hero hero = (Hero)ois.readObject();
			//インスタンスのフィールドをコンソールに表示
			System.out.println("名前：" + hero.getName() + " HP：" + hero.getHp()+ " MP：" + hero.getMp());
		} catch (Exception e) {
			System.out.println("例外が発生しました");
			e.printStackTrace();
		}
	}

}
