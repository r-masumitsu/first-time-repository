package chapter10.question17;

import java.text.NumberFormat;
import java.util.Locale;


public class FormatSampleC {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.JAPAN);
		NumberFormat a = NumberFormat.getInstance();
		NumberFormat b = NumberFormat.getIntegerInstance();
		NumberFormat c = NumberFormat.getCurrencyInstance(Locale.US);	//通過フォーマットだけをアメリカに変更
		NumberFormat d = NumberFormat.getPercentInstance();
		
		System.out.println(a.format(1000.1));
		System.out.println(b.format(1000.1));
		System.out.println(c.format(1000.1));
		System.out.println(d.format(0.1));
	}

}
