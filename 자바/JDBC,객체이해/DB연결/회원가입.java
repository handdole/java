package DB����;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ȸ������ {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);

		DBó�� login = new DBó��();
		DBó�� delete = new DBó��();
		DBó�� connect = new DBó��();

		JButton btnNewButton = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login.login();
				f.setVisible(false);
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("����", Font.PLAIN, 53));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);

		JButton btnNewButton_1 = new JButton("\uD68C\uC6D0\uD0C8\uD1F4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete.delete();
			}
		});
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setFont(new Font("����", Font.PLAIN, 53));
		f.getContentPane().add(btnNewButton_1, BorderLayout.SOUTH);

		JButton btnNewButton_2 = new JButton("DB\uC5F0\uACB0");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connect.connect();
			}
		});
		btnNewButton_2.setFont(new Font("����", Font.PLAIN, 63));
		btnNewButton_2.setBackground(Color.CYAN);
		f.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);

		f.setVisible(true);

	}

}
