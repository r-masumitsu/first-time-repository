package chapter15.section12;

public class loggerMain {

	public static void main(String[] args) {
		Mylogger logger1 = new Mylogger();
		logger1.log("first");
		Mylogger logger2 = new Mylogger();
		logger2.log("second");
	}

}
