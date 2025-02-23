package chapter8.section6;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class URLMain {

	public static void main(String[] args) throws Exception {
		URL url = new URL("https://dokojava.jp/favicon.ico");
		//アウトプットのストリームを用意
		try (OutputStream os = new FileOutputStream(
				"/Applications/Eclipse_2023-12.app/Contents/workspace/sukkiriPractice/resources/dj.ico");) {

			//インプットのストリームを用意
			InputStream is = url.openStream();
			//読み書き
			int data = is.read();
			while (data != -1) {
				os.write((byte) data);
				data = is.read();
			}
			os.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
