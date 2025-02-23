package chapter17;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//匿名クラスを利用することによって、別でActionListenerを実装したクラスを用意しなくてもよくなる。
public class AnonymousActionListenerMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame("はじめてのSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setLayout(new FlowLayout()); //ウィジェット追加の準備

		JLabel label = new JLabel("Hello World!!"); //ラベルを生成して、
		frame.add(label); //ラベルに追加
		JButton button = new JButton("押してね"); //ボタンを生成して、
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("押されました！");
			}
		});
		frame.add(button); //フレームに追加

		frame.setVisible(true);
		System.out.println("フレームを表示");

	}

}
