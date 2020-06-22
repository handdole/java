package 윈도우;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화프로그램 {
	private static JTextField t1;
	static double m1 = 9.16;
	static double m2 = 8.74;
	static double m3 = 9.76;
	static double m4 = 9.27;
	static double m5 = 8.47;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setSize(579, 606);
		f.getContentPane().setLayout(null);
		JLabel img = new JLabel("");
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 32));

		JButton btnNewButton = new JButton(
				"\uC9C0\uD478\uB77C\uAE30\uB77C\uB3C4 \uC7A1\uACE0 \uC2F6\uC740 \uC9D0\uC2B9\uB4E4 ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("m1.jpg");
				img.setIcon(icon);
				t1.setText("이 영화의 평점은 " + m1 + "점 입니다.");

			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 19));
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(33, 23, 145, 53);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uC815\uC9C1\uD55C \uD6C4\uBCF4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("m2.jpg");
				img.setIcon(icon);
				t1.setText("이 영화의 평점은 " + m2 + "점 입니다.");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 19));
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setBounds(33, 99, 145, 53);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("1917");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("m3.jpg");
				img.setIcon(icon);
				t1.setText("이 영화의 평점은 " + m3 + "점 입니다.");
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 19));
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setBounds(33, 177, 145, 53);
		f.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("\uC791\uC740\uC544\uC528\uB4E4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("m4.jpg");
				img.setIcon(icon);
				t1.setText("이 영화의 평점은 " + m4 + "점 입니다.");
			}
		});
		btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 19));
		btnNewButton_3.setBackground(Color.CYAN);
		btnNewButton_3.setBounds(33, 261, 145, 53);
		f.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("\uD074\uB85C\uC82F");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("m5.jpg");
				img.setIcon(icon);
				t1.setText("이 영화의 평점은 " + m5 + "점 입니다.");
			}
		});
		btnNewButton_4.setFont(new Font("굴림", Font.PLAIN, 19));
		btnNewButton_4.setBackground(Color.CYAN);
		btnNewButton_4.setBounds(33, 339, 145, 53);
		f.getContentPane().add(btnNewButton_4);

		img.setBounds(227, 23, 278, 417);
		f.getContentPane().add(img);

		t1.setBounds(33, 462, 472, 70);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		f.setVisible(true);

	}

}
