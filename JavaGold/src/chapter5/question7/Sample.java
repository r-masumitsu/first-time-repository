package chapter5.question7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Sample {

	public static void main(String[] args)throws Exception{
		FileInputStream fis = new FileInputStream("head_cake.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("head_cake_bk.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		try(bis; bos){
			byte[] data = null;
			while((data = bis.readNBytes(1024)).length != 0) {
				bos.write(data);
			}
			bos.flush();
			System.out.println("コピー完了");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
