package chapter17;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LayoutMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame("はじめてのSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		
		frame.setLayout(null);	//ウィジェット追加の準備
		JLabel label = new JLabel("Hello World!!");	//ラベルを生成して、
		label.setLocation(10,10);	//ラベルの座標指定
		label.setSize(200,20);	//ラベルのサイズ指定
		frame.add(label);	//ラベルに追加
		JButton button = new JButton("押してね");	//ボタンを生成して、
		button.setLocation(250,100);	//ボタンの座標指定
		button.setSize(100,20);	//ボタンのサイズ指定
		frame.add(button);	//フレームに追加
		
		frame.setVisible(true);
		System.out.println("フレームを表示");
	}

}
