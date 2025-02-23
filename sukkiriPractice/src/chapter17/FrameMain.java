package chapter17;

import javax.swing.JFrame;

public class FrameMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame("はじめてのSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setVisible(true);
		System.out.println("フレームを表示");
	}

}
