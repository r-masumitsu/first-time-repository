package chapter5.question5;

import java.io.FileWriter;

public class Sample {

	public static void main(String[] args) throws Exception{
		/*
		 * 第二引数trueで追記モード
		 * デフォルトはfalseで上書きモード
		 */
		FileWriter out = new FileWriter("output.txt", true);
		try(out){
			out.write("\n");	//改行コードを書き込み
			out.write("Hello, Java!");
		}
	}

}
