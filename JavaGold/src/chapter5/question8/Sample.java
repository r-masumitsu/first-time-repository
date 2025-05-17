package chapter5.question8;

import java.io.Console;

public class Sample {

	public static void main(String[] args) {
		//カレントディレクトリを確認してみた
		String userDirectoryPath = System.getProperty("user.dir");
		System.out.println("Current Directory = \"" + userDirectoryPath + "\"" );
		
		Console console = System.console();
		if (console == null) {	//IDEで実行したときはconsoleはnullになる
			System.err.println("Consoleが使用できません。端末から実行してください。");
			System.exit(1);
		}
		String str = console.readLine();
		System.out.println(str);
	}

}
