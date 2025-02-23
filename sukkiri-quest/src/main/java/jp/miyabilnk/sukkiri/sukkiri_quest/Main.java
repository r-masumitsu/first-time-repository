package jp.miyabilnk.sukkiri.sukkiri_quest;

import java.io.FileWriter;

import com.opencsv.CSVWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		System.out.println("スッキリ魔王征討 ver1.0.0 by minato");
		System.out.println("Mavenで鋭意開発中！待て次号！");
		
		CSVWriter writer = new CSVWriter(new FileWriter("rpgdata.csv"));
		String[] data = {"sukkiri-quest", "1.0.0"};
		writer.writeNext(data);
		writer.close();
	}

}
