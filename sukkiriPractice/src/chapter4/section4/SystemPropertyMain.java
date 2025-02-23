package chapter4.section4;

import java.util.Iterator;
import java.util.Properties;

public class SystemPropertyMain {

	public static void main(String[] args) {
		System.out.print("利用中のJavaバージョン：");
		System.out.println(System.getProperty("java.version"));
		
		Properties p = System.getProperties();
		Iterator<String> i = p.stringPropertyNames().iterator();
		while(i.hasNext()) {
			String key = i.next();
			System.out.print(key + " = ");
			System.out.println(System.getProperty(key));
		}
	}

}
