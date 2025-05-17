package chapter5.question8;

import java.io.Console;

public class UsePassword {

	public static void main(String[] args) {
		Console console = System.console();
		if (console == null) {	//IDEで実行したときはconsoleはnullになる
			System.err.println("Consoleが使用できません。端末から実行してください。");
			System.exit(1);
		}
		
		char[] password = console.readPassword();
		System.out.println(String.valueOf(password));
	}

}
