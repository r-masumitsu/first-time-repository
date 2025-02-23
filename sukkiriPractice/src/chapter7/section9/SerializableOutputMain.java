package chapter7.section9;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//インスタンスを保存するプログラム
public class SerializableOutputMain {

	public static void main(String[] args) {
		String employeeName = "田中太郎";
		int age = 41;
		String departmentName = "総務部";
		Employee employee = new Employee(employeeName,age);
		Department department = new Department(departmentName,employee);
		try(FileOutputStream fos = new FileOutputStream("/Applications/Eclipse_2023-12.app/Contents/workspace/sukkiriPractice/resources/company.dat")) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			//インスタンスの直列化と保存
			oos.writeObject(department);
			oos.flush();
			System.out.println("直列化機構を使って書き込みが完了しました");
		} catch (Exception e) {
			System.out.println("例外が発生しました");
			e.printStackTrace();
		}
	}

}
