package chapter17;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ActionListenerMain {
	public static void main(String[] args) {

		JFrame frame = new JFrame("はじめてのSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setLayout(new FlowLayout()); //ウィジェット追加の準備

		JLabel label = new JLabel("Hello World!!"); //ラベルを生成して、
		frame.add(label); //ラベルに追加
		JButton button = new JButton("押してね"); //ボタンを生成して、
		button.addActionListener(new MinatoListener()); //ボタンが押されたらMinatoListenerのactionPerformed()を呼び出すよう登録
		frame.add(button); //フレームに追加

		frame.setVisible(true);
		System.out.println("フレームを表示");
	}

}
