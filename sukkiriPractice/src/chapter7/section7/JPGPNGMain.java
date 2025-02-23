package chapter7.section7;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

import javax.imageio.ImageIO;

//JPGファイルをPNG形式に変換するプログラム
public class JPGPNGMain {

	public static void main(String[] args) throws Exception{
		BufferedImage image = ImageIO.read(new File("/Applications/Eclipse_2023-12.app/Contents/workspace/sukkiriPractice/resources/head_cake.jpg"));
		try(FileOutputStream fos = new FileOutputStream("/Applications/Eclipse_2023-12.app/Contents/workspace/sukkiriPractice/resources/head_cake.png");){
			ImageIO.write(image, "png", fos);
		}
	}
}
