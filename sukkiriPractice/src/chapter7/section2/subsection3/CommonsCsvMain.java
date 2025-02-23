package chapter7.section2.subsection3;

import java.io.FileReader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class CommonsCsvMain {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("/Applications/Eclipse_2023-12.app/Contents/workspace/sukkiriPractice/resources/ケポト.csv");) {
			Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(fr);
			for(CSVRecord record : records) {
				String one = record.get(0);
				String two = record.get(1);
				String three = record.get(2);
				System.out.println(one + "！" + two +  "！" + three +  "！");
			}
		} catch (Exception e) {
			System.out.println("例外が発生しました: " + e.getMessage());
		}
	}

}
