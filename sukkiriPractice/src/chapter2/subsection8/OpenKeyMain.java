package chapter2.subsection8;
import static chapter2.subsection8.Keytype.*;

public class OpenKeyMain {

	public static void main(String[] args) {
		StrongBox<String> strongBox = new StrongBox<>(PADLOCK);
		strongBox.put("南京錠");
		
		for(int i = 0; i <= strongBox.getPADLOCKCOUNT(); i++) {
			System.out.println(i + "回目");
			System.out.println(strongBox.get());
		}
	}

}
