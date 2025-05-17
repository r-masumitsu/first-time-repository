package chapter5.question6;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Sample {

	public static void main(String[] args) throws Exception{
		/*
		 * 第二引数trueで追記モード
		 * デフォルトはfalseで上書きモード
		 */
		FileWriter out = new FileWriter("output.txt", true);
		BufferedWriter writer = new BufferedWriter(out);
		try(writer){
			writer.newLine();
			writer.write("buffering output");
			writer.flush();
		};
	}

}
