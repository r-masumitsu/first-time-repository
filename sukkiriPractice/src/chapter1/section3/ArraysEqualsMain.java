package chapter1.section3;

import java.util.Arrays;

public class ArraysEqualsMain {
	public static void main(String[] args) {
		int[] arrayA = {1,2,3,4,5};
		int[] arrayB = {1,2,3,4,5};
		
		boolean bool1 = arrayA.equals(arrayB);	//誤った判定（等値判定）
		boolean bool2 = Arrays.equals(arrayA, arrayB);	//正しい判定（等価判定）
		
		System.out.println(bool1);
		System.out.println(bool2);
	}
}
