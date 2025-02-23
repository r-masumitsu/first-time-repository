package chapter17;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LoginScreen1 {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			// フレームの作成
			JFrame frame = new JFrame("ログイン画面");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(400, 250);
			frame.setLayout(new GridBagLayout()); // レイアウトマネージャーを設定

			GridBagConstraints gbc = new GridBagConstraints();
			gbc.insets = new Insets(5, 5, 5, 5); // 余白を設定

			// ユーザーIDラベル
			gbc.gridx = 0;
			gbc.gridy = 0;
			frame.add(new JLabel("ユーザーID:"), gbc);

			// ユーザーID入力フィールド
			gbc.gridx = 1;
			JTextField userField = new JTextField(15);
			frame.add(userField, gbc);

			// パスワードラベル
			gbc.gridx = 0;
			gbc.gridy = 1;
			frame.add(new JLabel("パスワード:"), gbc);

			// パスワード入力フィールド（伏せ字を「★」に設定）
			gbc.gridx = 1;
			JPasswordField passField = new JPasswordField(15);
			passField.setEchoChar('★');
			frame.add(passField, gbc);

			// チェックボックス（動作しない）
			gbc.gridx = 0;
			gbc.gridy = 2;
			JCheckBox checkBox = new JCheckBox("パスワードは隠さない");
			checkBox.setEnabled(false); // 動作しないようにする
			frame.add(checkBox, gbc);
			
			// ダミーのログインボタン（動作しない）
			gbc.gridy = 3;
			gbc.gridwidth = 2;
			JButton loginButton = new JButton("ログイン");
			loginButton.setEnabled(false); // 動作しないようにする
			frame.add(loginButton, gbc);
			
			// ダミーのクリアボタン（動作しない）
			gbc.gridx = 1;
			gbc.gridy = 3;
			gbc.gridwidth = 2;
			JButton clearButton = new JButton("クリア");
			clearButton.setEnabled(false); // 動作しないようにする
			frame.add(clearButton, gbc);

			// ウィンドウのサイズ変更を許可
			frame.setResizable(true);

			// 画面を中央に配置
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
		});
	}
}