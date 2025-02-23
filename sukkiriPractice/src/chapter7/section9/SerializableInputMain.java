package chapter7.section9;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//インスタンスを復元し表示するプログラム
public class SerializableInputMain {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("/Applications/Eclipse_2023-12.app/Contents/workspace/sukkiriPractice/resources/company.dat")) {
			ObjectInputStream ois = new ObjectInputStream(fis);
			//ファイルからインスタンスを復元
			Department department = (Department)ois.readObject();
			//インスタンスのフィールドをコンソールに表示
			System.out.println("所属部署：" + department.getName() + " 名前：" + department.getLeader().getName() + " 年齢：" + department.getLeader().getAge());
		} catch (Exception e) {
			System.out.println("例外が発生しました");
			e.printStackTrace();
		}
	}

}
