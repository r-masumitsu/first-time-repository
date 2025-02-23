package chapter17;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class EventDispatchMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame("はじめてのSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setLayout(new FlowLayout()); //ウィジェット追加の準備

		JLabel label = new JLabel("Hello World!!"); //ラベルを生成して、
		frame.add(label); //ラベルに追加
		JButton button = new JButton("押してね"); //ボタンを生成して、
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try(BufferedReader br = Files.newBufferedReader(Paths.get("/Applications/Eclipse_2023-12.app/Contents/workspace/sukkiriPractice/resources/rpg.txt"))){
					System.out.println("押されました！");	
					label.setText(br.readLine());	//1行読み込んでラベルのテキストを書き換える
				}catch (IOException e) {
					JOptionPane.showMessageDialog(frame, "rpg.txtファイルを開けませんでした","エラー発生", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		frame.add(button); //フレームに追加

		frame.setVisible(true);
		System.out.println("フレームを表示");


	}

}
