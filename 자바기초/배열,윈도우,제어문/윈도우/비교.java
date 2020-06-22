package 윈도우;

import javax.swing.JFrame;   // 패키지 java나 javax  로 만들면 안됨 이미 기본값으로 만들어져있는것들이 있으.
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 비교 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(742, 566);
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("PUSH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int con = JOptionPane.showConfirmDialog(null, "아침을 먹었나요?");

				if (con == 0) {
					JOptionPane.showMessageDialog(null, "오뎅 댕꿀맛");
				} else if (con == 1) {
					JOptionPane.showMessageDialog(null, "배고프겠네요");
				} else {
					JOptionPane.showMessageDialog(null, "나한테 왜그래여?");
				}
			}
		});
		btnNewButton.setBounds(55, 81, 141, 154);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uB098\uB97C \uB20C\uB7EC...");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				//기본형 밖에 안되는데 root 는 스트링이니까 이퀄함수를 꼭 써줘야함.
				if (id.equals("root")&& pw.equals("1234")) {
					JOptionPane.showMessageDialog(null, "로그인 ok");
				} else {
					JOptionPane.showMessageDialog(null, "로그인 not!");
				}
				t1.setText("");
				t2.setText("");   // 로그인 되면 공백이 나와야 하기 때문에 이런 처리를 해줌.
			}
		});
		btnNewButton_1.setBounds(55, 289, 521, 102);
		f.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("\uBC15\uD55C\uC194\uC758 \uC708\uB3C4\uC6B0");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setBounds(271, 81, 305, 48);
		f.getContentPane().add(lblNewLabel);

		t1 = new JTextField();
		t1.setBounds(271, 139, 305, 39);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(271, 196, 305, 39);
		f.getContentPane().add(t2);

		f.setVisible(true);
	}
}
