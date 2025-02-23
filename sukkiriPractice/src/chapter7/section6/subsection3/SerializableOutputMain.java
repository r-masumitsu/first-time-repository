package chapter7.section6.subsection3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//勇者インスタンスを保存するプログラム
public class SerializableOutputMain {

	public static void main(String[] args) {
		Hero hero = new Hero("ミナト", 75, 18);
		try(FileOutputStream fos = new FileOutputStream("/Applications/Eclipse_2023-12.app/Contents/workspace/sukkiriPractice/resources/rpgsave.dat")) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			//インスタンスの直列化と保存
			oos.writeObject(hero);
			oos.flush();
		} catch (Exception e) {
			System.out.println("例外が発生しました");
			e.printStackTrace();
		}
	}

}
