package chapter5.question11;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//カスタムシリアライズ
public class Employee implements Serializable {
	private String name;
	private String telephone;
	
	public Employee(String name, String telephone) {
		super();
		this.name = name;
		this.telephone = telephone;
	}
	/*
	 * シリアライズ時に自動的に自動的に呼び出される
	 */
	private void writeObject(ObjectOutputStream out) throws IOException{
		System.out.println("write");
		out.writeObject(name);
		out.writeObject(telephone);
	}
	/*
	 * デリアライズ時に自動的に自動的に呼び出される
	 */
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
		System.out.println("read");
		this.name = (String)in.readObject();
		this.telephone = (String)in.readObject();
	}

	public String getName() {
		return name;
	}

	public String getTelephone() {
		return telephone;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", telephone=" + telephone + "]";
	}
}
