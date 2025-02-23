package chapter17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinatoListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("押されました！");
	}

}
