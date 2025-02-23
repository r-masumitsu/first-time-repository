package chapter8.section2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

//Socketを用いてWebページを取得するプログラム
public class SocketMain {
	public static void main(String[] args) throws IOException {
		//IPアドレスまたはホスト名とポート番号を指定してSocketクラスをインスタンス化する
		Socket sock = new Socket("dokojava.jp",80);
		//Socketから入力ストリームと出力ストリームを取得する
		InputStream is = sock.getInputStream();
		OutputStream os = sock.getOutputStream();
		//HTTP要求を送信
		os.write("GET /index.html HTTP/1.0¥r¥n".getBytes());
		os.write("¥r¥n".getBytes());
		os.flush();
		InputStreamReader isr = new InputStreamReader(is);
		//応答を受信
		int i = isr.read();
		while(i != -1) {
			System.out.print((char) i);
			i = isr.read();
		}
		//ソケットを閉じる
		sock.close();
	}
}
