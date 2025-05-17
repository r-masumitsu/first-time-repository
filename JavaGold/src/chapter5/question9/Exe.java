package chapter5.question9;

import java.util.Scanner;

public class Exe {

	public static void main(String[] args) {
		Scanner scan = new Scanner("A,B,C,D,E");
		scan.useDelimiter(",");
		try(scan){
			scan.next();
			scan.next();
			scan.next();
			scan.next();
			System.out.println(scan.next());
		}
	}

}
