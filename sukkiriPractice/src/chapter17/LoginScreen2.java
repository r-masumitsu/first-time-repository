package chapter17;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LoginScreen2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // フレームの作成
            JFrame frame = new JFrame("ログイン画面");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 250);
            frame.setLayout(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5); // 余白

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

            // パスワード表示チェックボックス
            gbc.gridx = 1;
            gbc.gridy = 2;
            JCheckBox checkBox = new JCheckBox("パスワードを隠さない");
            frame.add(checkBox, gbc);

            // チェックボックスの動作（パスワードの表示切替）
            checkBox.addActionListener(e -> {
                if (checkBox.isSelected()) {
                    passField.setEchoChar((char) 0); // 伏せ字解除
                } else {
                    passField.setEchoChar('★'); // 伏せ字設定
                }
            });

            // ボタンパネル（ログイン・クリア）
            JPanel buttonPanel = new JPanel();
            JButton loginButton = new JButton("ログイン");
            JButton clearButton = new JButton("クリア");
            buttonPanel.add(loginButton);
            buttonPanel.add(clearButton);

            gbc.gridx = 0;
            gbc.gridy = 3;
            gbc.gridwidth = 2;
            frame.add(buttonPanel, gbc);

            // クリアボタンの動作
            clearButton.addActionListener(e -> {
                userField.setText("");
                passField.setText("");
            });

            // ログインボタンの動作
            loginButton.addActionListener(e -> {
                String user = userField.getText();
                String pass = new String(passField.getPassword());
                if ("minato".equals(user) && "yusuke".equals(pass)) {
                    JOptionPane.showMessageDialog(frame, "ログイン成功！", "成功", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "ログイン失敗", "エラー", JOptionPane.ERROR_MESSAGE);
                }
            });

            // 画面を中央に配置
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}