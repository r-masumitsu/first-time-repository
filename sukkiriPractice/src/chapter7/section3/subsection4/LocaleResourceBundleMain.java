package chapter7.section3.subsection4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleResourceBundleMain {

	public static void main(String[] args) {
		Locale loc = Locale.getDefault();
		System.out.println(loc.getCountry() + "-" + loc.getLanguage());
		String now = (new SimpleDateFormat()).format(new Date());
		ResourceBundle rb = ResourceBundle.getBundle("messages");
		System.out.println(rb.getString("CURRENT_TIME_IS") + now);
	}

}
